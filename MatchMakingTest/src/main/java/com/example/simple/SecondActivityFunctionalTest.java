package com.example.simple;

import com.example.simple.R;
import com.example.simple.SecondActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.TextView;
import android.test.suitebuilder.annotation.SmallTest;

public class SecondActivityFunctionalTest extends
		ActivityInstrumentationTestCase2<SecondActivity> {

	private static final String NEW_TEXT = "new text";

	public SecondActivityFunctionalTest() {
		super(SecondActivity.class);
	}

	@SmallTest
	public void testSetText() throws Exception {

		SecondActivity activity = getActivity();

		// search for the textView
		final TextView textView = (TextView) activity
				.findViewById(R.id.resultText);

		// set text
		getActivity().runOnUiThread(new Runnable() {
			
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});

		getInstrumentation().waitForIdleSync();
		assertEquals("Text incorrect", NEW_TEXT, textView.getText().toString());

	}

	@UiThreadTest
	@SmallTest
	public void testSetTextWithAnnotation() throws Exception {

		SecondActivity activity = getActivity();

		// search for the textView
		final TextView textView = (TextView) activity
				.findViewById(R.id.resultText);

		textView.setText(NEW_TEXT);
		assertEquals("Text incorrect", NEW_TEXT, textView.getText().toString());

	}
}
