package com.example.compulistmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebView1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view1);

        WebView WEBVIEW = (WebView) findViewById(R.id.webview1);
        WEBVIEW.loadUrl("https://www.amazon.com/s?k=aorus+gaming+9&crid=X715O3QZ3EMU&sprefix=aorus+gaming+%2Caps%2C778&ref=nb_sb_noss_2");
    }
}