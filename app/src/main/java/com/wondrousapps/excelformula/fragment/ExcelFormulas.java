package com.wondrousapps.excelformula.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.wondrousapps.excelformula.R;

public class ExcelFormulas extends Fragment {

WebView webView;

    public ExcelFormulas() {
        }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //webView.loadUrl("file:///android_asset/policy.html")

        View v= inflater.inflate(R.layout.fragment_excel_formulas, container, false);
        webView=v.findViewById(R.id.forumlas);
        webView.loadUrl("file:///android_asset/tab1_excel_formulas/index.html");
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
// Enable Javascript
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.canGoBack();
        webView.setOnKeyListener(new View.OnKeyListener() {

            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK
                        && event.getAction() == MotionEvent.ACTION_UP
                        && webView.canGoBack()) {
                    webView.goBack();
                    return true;
                }
                return false;
            }
        });
        // Force links and redirects to open in the WebView instead of in a browser
        webView.setWebViewClient(new WebViewClient());
        return v;
        }
}