package com.android.pintrest.grid.sample;

import com.etsy.android.sample.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setTitle("Pinterest Grid");
		setContentView(R.layout.activity_main);

		findViewById(R.id.btn_sgv).setOnClickListener(this);
	}

	@Override
	public void onClick(final View v) {
		if (v.getId() == R.id.btn_sgv) {
			startActivity(new Intent(this, StaggeredGridActivity.class));
		}
	}
}
