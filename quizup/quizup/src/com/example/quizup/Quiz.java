package com.example.quizup;

import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.view.Menu;

public class Quiz extends Activity {

	Bundle b;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quiz);
		b=getIntent().getExtras();
		String msg=b.getString("dbname");
		
		Cursor allrows  = db.rawQuery("SELECT * FROM "+  TABLE, null);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quiz, menu);
		return true;
	}

}
