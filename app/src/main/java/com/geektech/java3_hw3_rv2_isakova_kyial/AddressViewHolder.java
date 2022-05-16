package com.geektech.java3_hw3_rv2_isakova_kyial;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AddressViewHolder extends RecyclerView.ViewHolder{
    private TextView tvAddress;
    public AddressViewHolder(@NonNull View itemView) {
        super(itemView);
    }
    public void bind(String name){
        tvAddress.setText(name);
    }
}

