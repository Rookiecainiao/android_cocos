package com.example.test_androidforadt2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {
	Button button;
	static {
		System.loadLibrary("MyGame");
	}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button123);
    }
    public void button_click(View view){
    	System.out.println("hello , world");
    	Intent intent = new Intent(this,AppActivity.class);
    	startActivity(intent);
    }
}
