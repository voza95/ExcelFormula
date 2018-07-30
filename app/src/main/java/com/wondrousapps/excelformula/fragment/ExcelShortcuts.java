package com.wondrousapps.excelformula.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.wondrousapps.excelformula.R;

public class ExcelShortcuts extends Fragment {
    WebView webView;

    public ExcelShortcuts() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_excel_shortcuts, container, false);
        webView=v.findViewById(R.id.shortcutes);
        webView.loadUrl("file:///android_asset/tab3_shortcuts/index.html");
        webView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        // Enable Javascript
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
//        webView.canGoBack();
//        webView.setOnKeyListener(new View.OnKeyListener() {
//            public boolean onKey(View v, int keyCode, KeyEvent event) {
//                if (keyCode == KeyEvent.KEYCODE_BACK
//                        && event.getAction() == MotionEvent.ACTION_UP
//                        && webView.canGoBack()) {
//                    webView.goBack();
//                    return true;
//                }
//                return false;
//            }
//        });
//        // Force links and redirects to open in the WebView instead of in a browser
        webView.setWebViewClient(new WebViewClient());
        return v;
    }
}