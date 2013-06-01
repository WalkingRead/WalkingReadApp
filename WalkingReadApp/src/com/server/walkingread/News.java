package com.server.walkingread;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class News extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		WebView webview = new WebView(this);
		setContentView(webview);
		webview.loadUrl("http://thewalkingread.3owl.com");	}


}
