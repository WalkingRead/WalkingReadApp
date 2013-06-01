package com.server.walkingread;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Users extends Activity {
	// Pruebas|Temporal
	private Button btnSync;
	private TableLayout tl;
	private TableRow tr;
	private TextView lbUser1, lbUser2, lbUser3, lbUser4, lbUser5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_users);
		btnSync = (Button) findViewById(R.id.button_sync);
		btnSync.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Toast.makeText(getApplicationContext(), "Sincronizamos",
						Toast.LENGTH_LONG).show();

			}
		});

		tl = (TableLayout) findViewById(R.id.contentTable);
		generateUsers();
	}

	public void generateUsers() {
		Random random = new Random();
		for (int i = 0; i < 40; i++) {
			tr = new TableRow(getApplicationContext());
			lbUser1 = new TextView(getApplicationContext());
			lbUser2 = new TextView(getApplicationContext());
			lbUser3 = new TextView(getApplicationContext());
			lbUser4 = new TextView(getApplicationContext());
			lbUser5 = new TextView(getApplicationContext());

			ToggleButton swState = new ToggleButton(getApplicationContext());
			lbUser1.setText("Jugador" + random.nextInt(40));
			lbUser2.setText(" Jugador" + random.nextInt(40));
			lbUser3.setText(" Jugador" + random.nextInt(40));
			lbUser4.setText(" Jugador" + random.nextInt(40));
			lbUser5.setText(" Jugador" + random.nextInt(40));

			lbUser5.setPadding(0, 0, 50, 0);

			swState.setTextOn("Baneado");
			swState.setTextOff("No Baneado");

			swState.setChecked(random.nextBoolean());
			tr.addView(lbUser1);
			tr.addView(lbUser2);
			tr.addView(lbUser3);
			tr.addView(lbUser4);
			tr.addView(lbUser5);
			tr.addView(swState);
			tl.addView(tr);

		}
	}
}
