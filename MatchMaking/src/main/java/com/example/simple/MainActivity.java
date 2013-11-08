package com.example.simple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	 @Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);
	  }

	  public void onClick(View view) {
	    Intent intent = new Intent(this, SecondActivity.class);
	    intent.putExtra("URL", "http://www.hdm-stuttgart.de/~doersam");
	    startActivity(intent);
	  }

}
