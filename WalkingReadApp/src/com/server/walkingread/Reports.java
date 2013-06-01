package com.server.walkingread;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Reports extends Activity {

	private Spinner spOptions;
	private ArrayList<String> elements;
	private ArrayAdapter<String> adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reports);
		spOptions = (Spinner) findViewById(R.id.spinner1);
		elements = new ArrayList<String>();
		elements.add("Matado en horario pve");
		elements.add("Falta de respeto en el juego");
		elements.add("Sugerencia");
		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, elements);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
		spOptions.setAdapter(adapter);

	}

}
