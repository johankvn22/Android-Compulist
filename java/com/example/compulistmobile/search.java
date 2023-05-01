package com.example.compulistmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class search extends AppCompatActivity implements View.OnClickListener{
    CardView MB1;
    ImageView BACK;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        MB1 = (CardView) findViewById(R.id.mb1);
        BACK = (ImageView) findViewById(R.id.back);

        MB1.setOnClickListener((View.OnClickListener)this);
        BACK.setOnClickListener((View.OnClickListener)this);
    }
    @Override
    public void onClick(View v){
        Intent i;
        switch (v.getId()){
            case R.id.mb1 : i = new Intent(this,info_mb.class); startActivity(i); break;
            case R.id.back: i = new Intent(this,product_mb.class); startActivity(i); break;
        }
    }
}