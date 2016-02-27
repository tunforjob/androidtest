package com.mycompany.myapp;

import android.app.*;
import android.os.*;
//import android.widget.Button;
import android.widget.*;
import android.view.View;

public class MainActivity extends Activity 
{
    @Override
	private TextView meditText;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    	meditText = (TextView) findViewById(R.id.mainTextView);
		}
	public void go(View v)
	{
		meditText.setText("ggg");
		showToast(v);
	}
	
	public void showToast(View view) {
		//создаем и отображаем текстовое уведомление
		Toast toast = Toast.makeText(getApplicationContext(),
									 "Пора покормить кота!",
									 Toast.LENGTH_SHORT);
		//toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
	}
	
}
