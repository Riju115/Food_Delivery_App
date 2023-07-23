package com.example.fooddelivery;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.example.fooddelivery.Adapters.MainAdapter;
import com.example.fooddelivery.Models.MainModel;
import com.example.fooddelivery.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<MainModel>list=new ArrayList<>();
        list.add(new MainModel(R.drawable.download10,"Veg Burger","43","Burger with Extra Cheese"));
        list.add(new MainModel(R.drawable.download23,"Veg Burger","55","Paneer Burger"));
        list.add(new MainModel(R.drawable.download16,"Non-veg Burger","70","Chicken Burger with Extra Cheese"));
        list.add(new MainModel(R.drawable.down,"Rolls","35","Egg Roll"));
        list.add(new MainModel(R.drawable.down,"Rolls","40","(Double Egg) Roll"));
        list.add(new MainModel(R.drawable.download13," Chicken Rolls","55","Bhuna Chicken Roll"));
        list.add(new MainModel(R.drawable.download1,"Biriyani","100","Chicken Biriyani"));
        list.add(new MainModel(R.drawable.download17,"Sahi Biriyani","210","(Egg+Mutton) Biriyani"));
        list.add(new MainModel(R.drawable.download11,"Chicken Curry","40","Bihari Chicken Curry"));
        list.add(new MainModel(R.drawable.download12,"Mutton Curry","80","Punjabi Mutton Curry"));
        list.add(new MainModel(R.drawable.download2,"Mughlai","60","Double Egg Mughlai"));
        list.add(new MainModel(R.drawable.download4,"Veg-Chowmein","40","plain Chowmein"));
        list.add(new MainModel(R.drawable.download25,"Non-veg Chowmein","45","Double Egg Chowmein"));
        list.add(new MainModel(R.drawable.downloadnew26,"Non-veg Chowmein","80","(Chicken+Egg) Chowmein"));
        list.add(new MainModel(R.drawable.download8,"Dosa","80","Masala Dosa"));
        list.add(new MainModel(R.drawable.download9,"Idly","60","Masala Idly"));
        list.add(new MainModel(R.drawable.download7,"Pizza","160","Classic Cheese Pizza"));
        list.add(new MainModel(R.drawable.download24,"Cheese Pizza","190","Classic Extra Cheese Pizza"));
        list.add(new MainModel(R.drawable.download21,"Pizza","200","Spicy Chicken Pizza"));
        list.add(new MainModel(R.drawable.download5,"Fried Rice","65","Vegetable Fried Rice"));
        list.add(new MainModel(R.drawable.download3,"Chilli Paneer","40","Chilli Paneer(dry & Gravy"));
        list.add(new MainModel(R.drawable.download6,"Chilli Chicken ","50","Chilli Chicken"));
        list.add(new MainModel(R.drawable.downloadnew28,"Naan","10","Plain Naan 1 piece"));
        list.add(new MainModel(R.drawable.downloadnew27,"Naan","15","Butter Naan 1 piece"));
        list.add(new MainModel(R.drawable.download15,"Veg Momo","40","Plain Momo"));
        list.add(new MainModel(R.drawable.download14,"Non-Veg Momo","60","Chicken Momo"));
        list.add(new MainModel(R.drawable.download20,"Cutlet","80","Fish Cutlet"));
        list.add(new MainModel(R.drawable.download18,"Cutlet","60","Special Chicken Cutlet"));
        list.add(new MainModel(R.drawable.download19,"Tikka","50","Masala Paneer Tikka"));
        list.add(new MainModel(R.drawable.download22,"Tikka","90","Tandoori Chicken Tikka"));


        MainAdapter adapter = new MainAdapter(list ,this);
        binding.recylerview.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.orders:
                startActivity(new Intent(MainActivity.this,OrderActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}