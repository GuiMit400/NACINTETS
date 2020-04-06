package com.example.intents;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;

public class RespostaWebMotors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resposta_web_motors);

        Intent intent = getIntent();
        WebView webview = findViewById(R.id.webviewW);
        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://www.webmotors.com.br");
    }
}
