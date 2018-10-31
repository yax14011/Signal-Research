package org.thoughtcrime.securesms.webrtc;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.thoughtcrime.securesms.PassphraseRequiredActionBarActivity;
import org.thoughtcrime.securesms.R;
import org.thoughtcrime.securesms.logging.Log;


public class MonitorModeActivity extends PassphraseRequiredActionBarActivity
{

  public static final String TAG = "Monitor Mode";

  Button statBut, profileBut, photoBut, labBut, calendarBut, alertBut;

  @Override
  protected void onCreate(Bundle state, boolean ready) {
    super.onCreate(state, ready);
    Log.d(TAG, "onCreate");
    setContentView(R.layout.monitor_mode_activity);

    statBut = (Button) findViewById(R.id.stat);
    statBut.setOnClickListener(this::onClick);

    profileBut = (Button) findViewById(R.id.profile);
    profileBut.setOnClickListener(this::onClick);

    photoBut = (Button) findViewById(R.id.photo);
    photoBut.setOnClickListener(this::onClick);

    labBut = (Button) findViewById(R.id.lab);
    labBut.setOnClickListener(this::onClick);

    calendarBut = (Button) findViewById(R.id.calendar);
    calendarBut.setOnClickListener(this::onClick);

    alertBut = (Button) findViewById(R.id.alert);
    alertBut.setOnClickListener(this::onClick);
  }

  @Override
  protected void onStart(){
    super.onStart();
    Log.d(TAG, "onStart");
  }

  @Override
  protected void onResume(){
    super.onResume();
    Log.d(TAG, "onResume");
  }

  @Override
  protected void onPause(){
    super.onPause();
    Log.d(TAG, "onPause");
  }

  @Override
  protected void onStop(){
    super.onStop();
    Log.d(TAG, "onStop");
  }

  @Override
  protected void onDestroy(){
    super.onDestroy();
    Log.d(TAG, "onDestroy");
  }

  @Override
  protected void onRestart(){
    super.onRestart();
    Log.d(TAG, "onRestart");
  }

  public void onClick(View v){
    switch (v.getId()){
      case R.id.stat:
        Toast.makeText(MonitorModeActivity.this, "You click statistics.",
                Toast.LENGTH_SHORT).show();
        break;
      case R.id.profile:
        Toast.makeText(MonitorModeActivity.this, "You click profile.",
                Toast.LENGTH_SHORT).show();
        break;
      case R.id.photo:
        Toast.makeText(MonitorModeActivity.this, "You click photo.",
                Toast.LENGTH_SHORT).show();
        break;
      case R.id.lab:
        Toast.makeText(MonitorModeActivity.this, "You click lab.",
                Toast.LENGTH_SHORT).show();
        break;
      case R.id.calendar:
        Toast.makeText(MonitorModeActivity.this, "You click calendar.",
                Toast.LENGTH_SHORT).show();
        break;
      case R.id.alert:
        Toast.makeText(MonitorModeActivity.this, "You click alert.",
                Toast.LENGTH_SHORT).show();
        break;
      default:
        break;
    }
  }

  public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.monitor_mode, menu);
    return true;
  }

  public boolean onOptionsItemSelected(MenuItem item) {
    switch(item.getItemId()) {
      case R.id.back:
        finish();
        break;
       default:
         break;
    }
    return true;
  }

}
