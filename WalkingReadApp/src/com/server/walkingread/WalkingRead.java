package com.server.walkingread;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;

public class WalkingRead extends TabActivity {
	// Pruebas|Temporal


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_walkingread);

		TabHost tabHost = getTabHost();
		tabHost.addTab(tabHost.newTabSpec("tab1")
				.setIndicator("Noticias", null)
				.setContent(new Intent(getApplicationContext(), News.class)));
		tabHost.addTab(tabHost.newTabSpec("tab2")
				.setIndicator("Usuarios", null)
				.setContent(new Intent(getApplicationContext(), Users.class)));
		tabHost.addTab(tabHost.newTabSpec("tab2")
				.setIndicator("Incidencias", null)
				.setContent(new Intent(getApplicationContext(), Reports.class)));

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//MENU
		getMenuInflater().inflate(R.menu.walking_read, menu);
		return true;
	}

}
