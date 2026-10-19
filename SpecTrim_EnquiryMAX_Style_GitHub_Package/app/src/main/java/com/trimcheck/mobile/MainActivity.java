package com.trimcheck.mobile;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.JavascriptInterface;
import android.content.Intent;
import android.view.View;

public class MainActivity extends Activity {
    private WebView web;
    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        getWindow().setStatusBarColor(0xff0b1b38);
        getWindow().setNavigationBarColor(0xff0b1b38);
        web = new WebView(this);
        web.setBackgroundColor(0xfff5f8fc);
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setDomStorageEnabled(true);
        web.getSettings().setAllowFileAccess(true); // Required for bundled offline asset
        web.getSettings().setAllowContentAccess(false);
        web.getSettings().setMixedContentMode(WebSettings.MIXED_CONTENT_NEVER_ALLOW);
        web.setWebViewClient(new WebViewClient());
        web.setWebChromeClient(new WebChromeClient());
        web.addJavascriptInterface(new Object() {
            @JavascriptInterface public void shareText(String content) {
                runOnUiThread(() -> {
                    Intent send = new Intent(Intent.ACTION_SEND);
                    send.setType("text/plain");
                    send.putExtra(Intent.EXTRA_TEXT, content);
                    startActivity(Intent.createChooser(send, "Share TrimCheck summary"));
                });
            }
        }, "TrimCheckAndroid");
        setContentView(web);
       web.loadUrl("https://ollieduncan22-spec.github.io/Trimcheck-Test/");
    }
    @Override
public void onBackPressed() {
    if (web != null && web.canGoBack()) {
        web.goBack();
    } else {
        super.onBackPressed();
    }
}
    @Override protected void onDestroy() { if (web != null) {web.destroy();web=null;} super.onDestroy(); }
}
