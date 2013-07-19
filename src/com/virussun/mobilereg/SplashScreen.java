package com.virussun.mobilereg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

public class SplashScreen extends Activity {

	protected boolean _active = true;
	protected int _splashTime = 5000; // time to display the splash screen in ms
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        
        //объ€вление вс€ческих глобальных классов
      Objects.init();
       
        new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				//startActivity(new Intent(MainActivity.this, MatchesActivity.class));
				startActivity(new Intent(SplashScreen.this, MainActivity.class));
				finish();
			}
		}, 2000);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_splash_screen, menu);
        return true;
    }
}
