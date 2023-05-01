package com.example.compulistmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class info_mb extends AppCompatActivity implements View.OnClickListener {
    private CardView alibaba, amazon, shopee;
    ImageView kembali;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_mb);

        alibaba = (CardView) findViewById(R.id.alibaba_mb);
        amazon = (CardView) findViewById(R.id.amazon_mb);
        shopee = (CardView) findViewById(R.id.shopee_mb);
        kembali = (ImageView) findViewById(R.id.info_back);

        alibaba.setOnClickListener((View.OnClickListener)this);
        amazon.setOnClickListener((View.OnClickListener)this);
        shopee.setOnClickListener((View.OnClickListener)this);
        kembali.setOnClickListener((View.OnClickListener)this);
    }
    @Override
    public void onClick(View view){
        Intent i;
        switch (view.getId()){
            case R.id.alibaba_mb: i = new Intent(this,WebView1.class); startActivity(i);
            break;
            case R.id.amazon_mb: i = new Intent(this,WebView2.class); startActivity(i);
            break;
            case R.id.shopee_mb: i = new Intent(this,WebView3.class); startActivity(i);
            break;
            case R.id.info_back: i = new Intent(this,product_mb.class); startActivity(i);
            break;
        }
    }
}