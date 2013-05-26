package com.server.walkingread;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;

public class WalkingRead extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_walkingread);

		TabHost tabHost = getTabHost();
		tabHost.addTab(tabHost.newTabSpec("tab1")
				.setIndicator("Noticias", null).setContent(R.id.tab1));
		tabHost.addTab(tabHost.newTabSpec("tab2")
				.setIndicator("Usuarios", null).setContent(R.id.tab2));

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.walking_read, menu);
		return true;
	}

}
