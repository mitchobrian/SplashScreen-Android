package com.palmomedia.splashscreendemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		
        WebView mWebview = new WebView(this);
        mWebview.loadUrl("http://www.codeproject.com/Articles/113831/An-Advanced-Splash-Screen-for-Android-App");
        setContentView(mWebview);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
