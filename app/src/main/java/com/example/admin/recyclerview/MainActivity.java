package com.example.admin.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    String []arr={"Australia","Brazil","China","France","Germany","India","Ireland","Italy"};
    String []arr2={"Australia","Brazil","China","France","Germany","India","Ireland","Italy"};
    String []arr3={"Image1","Image2","Image3","Image4","Image5","Image6","Image7","Image8"};
    int []image={R.drawable.australia,R.drawable.brazil,R.drawable.china,R.drawable.france,R.drawable.germany,R.drawable.india,R.drawable.ireland,R.drawable.italy};
    String []arr1={"24.13 Millions","207.7 Millions","1.379 Billions","66.9 Millions","82.67 Millions","1.324 Billions","4.773 Millions","66.6 Millions"};
    ArrayAdapter<String> arrayAdapter;
    RecycleAdapter customAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        customAdapter= new RecycleAdapter(this,image,arr,arr1,arr2,arr3);
        recyclerView.setAdapter(customAdapter);




    }
}
