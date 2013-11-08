package com.example.simple;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
		 setContentView(R.layout.second);
		 if(getIntent().getExtras() != null && (getIntent().getExtras().size()> 0)) {
			 String name = getIntent().getExtras().getString("URL");
			 TextView titel = (TextView) findViewById(com.example.simple.R.id.resultText);
			 titel.setText(name);
		 }
	}
}
