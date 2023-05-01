package com.example.compulistmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebView2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view2);

        WebView WEBVIEW = (WebView) findViewById(R.id.webview2);
        WEBVIEW.loadUrl("https://www.tokopedia.com/search?q=aorus+gaming+9&source=universe&st=product&srp_component_id=02.07.01.01");
    }
}