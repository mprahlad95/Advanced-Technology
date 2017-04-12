package com.example.background;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
     
	EditText colour1, colour2, colour3;
	Button change;
	int c1, c2, c3;
	String c11, c22, c33;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		colour1=(EditText) findViewById(R.id.editText1);
		colour2=(EditText) findViewById(R.id.editText2);
		colour3=(EditText) findViewById(R.id.editText3);
		change=(Button) findViewById(R.id.button1);
		
		change.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				c11=colour1.getText().toString();
				c22=colour2.getText().toString();
				c33=colour3.getText().toString();
				c1=Integer.parseInt(c11);
				c2=Integer.parseInt(c22);
				c3=Integer.parseInt(c33);
				RelativeLayout bgElement = (RelativeLayout) findViewById(R.id.container);
				bgElement.setBackgroundColor(Color.rgb(c1, c2, c3));
				
			}
		});
			
		}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
