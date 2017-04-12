package com.example.quizup;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends Activity {

	private static String DBNAME = "test.db";
	private static String TABLE = "quiz";
	Button next;
	Bundle b;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		next = (Button) findViewById(R.id.button1);
		Intent i = new Intent(MainActivity.this, Quiz.class);
		
		//TESTING
		
		b.putString("dbname", DBNAME);
		b.putString("table", "TABLE");
		
		i.putExtras(b);
		
		//END OF TESTING
		
		startActivity(i);
		
		
		
		SQLiteDatabase  db = openOrCreateDatabase(DBNAME, Context.MODE_PRIVATE,null);
		
		db.execSQL("CREATE TABLE IF NOT EXISTS "+TABLE+"(no int, answer varchar;");
		db.execSQL("INSERT INTO " + TABLE + "(no, answer) VALUES('1','A')");
		db.execSQL("INSERT INTO " + TABLE + "(no, answer) VALUES('2','B')");
		db.execSQL("INSERT INTO " + TABLE + "(no, answer) VALUES('3','D')");
		db.execSQL("INSERT INTO " + TABLE + "(no, answer) VALUES('4','A')");
		db.execSQL("INSERT INTO " + TABLE + "(no, answer) VALUES('5','C')");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
