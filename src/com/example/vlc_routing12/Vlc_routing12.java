package com.example.vlc_routing12;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Vlc_routing12 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_vlc_routing12);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.vlc_routing12, menu);
		return true;
	}

}
