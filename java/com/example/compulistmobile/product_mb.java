package com.example.compulistmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class product_mb extends AppCompatActivity implements View.OnClickListener{
    CardView MB1;
    ImageView SEARCH;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_mb);

        MB1 = (CardView) findViewById(R.id.mb1);
        SEARCH = (ImageView) findViewById(R.id.search);

        MB1.setOnClickListener((View.OnClickListener)this);
        SEARCH.setOnClickListener((View.OnClickListener)this);
    }
    @Override
    public void onClick(View v){
        Intent i;
        switch (v.getId()){
            case R.id.mb1 : i = new Intent(this,info_mb.class); startActivity(i); break;
            case R.id.search: i = new Intent(this,search.class); startActivity(i); break;
        }
    }
}