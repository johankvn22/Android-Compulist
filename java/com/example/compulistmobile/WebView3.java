package com.example.compulistmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebView3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view3);

        WebView WEBVIEW = (WebView) findViewById(R.id.webview3);
        WEBVIEW.loadUrl("https://shopee.co.id/search?keyword=aorus%20gaming%209");
    }
}