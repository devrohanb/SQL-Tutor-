package rohanstech.dev.webview;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;


public class webview1 extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    WebView wv;
    ProgressBar pbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview1);

        wv=(WebView)findViewById(R.id.wv);
        pbar=(ProgressBar)findViewById(R.id.progressBar2);

        wv.setWebViewClient(new myWebClient());
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl("https://www.w3schools.com/sql/");


    }

    protected class myWebClient extends WebViewClient
    {
        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            pbar.setVisibility(View.GONE);
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return super.shouldOverrideUrlLoading(view, url);
        }

    }

}

