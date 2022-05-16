package com.geektech.java3_hw3_rv2_isakova_kyial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_address);
        ArrayList<String> address = new ArrayList<>();
        address.add("Chui avenue");
        address.add("Chui avenue");
        address.add("Chui avenue");
        address.add("Chui avenue");
        address.add("Chui avenue");
        address.add("Chui avenue");
        address.add("Chui avenue");


        AddressAdapter adapter=new AddressAdapter(address);
        recyclerView.setAdapter(adapter);
    }
}