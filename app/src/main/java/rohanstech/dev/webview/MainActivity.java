package rohanstech.dev.webview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button webview0 = (Button) findViewById(R.id.button9);
        webview0.setOnClickListener(new  View.OnClickListener(){

            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this ,webview1.class);
                startActivity(intent);
            }
        });


    }
}
