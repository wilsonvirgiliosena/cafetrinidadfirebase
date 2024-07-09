package com.sena.cafetrinidadfireb;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    private WebView webView;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.loadUrl("file:///android_asset/index.html");

        backButton = findViewById(R.id.back_to_main);
        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomePage.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}