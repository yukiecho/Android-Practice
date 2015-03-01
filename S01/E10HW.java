package com.example.chuncuiyuki.s01e09;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;


public class MainActivity extends ActionBarActivity {

    private CheckBox eatBox;
    private CheckBox sleepBox;
    private CheckBox dotaBox;
    private CheckBox selectallBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eatBox = (CheckBox) findViewById(R.id.eatID);
        sleepBox = (CheckBox) findViewById(R.id.sleepID);
        dotaBox = (CheckBox) findViewById(R.id.dotaID);
        selectallBox = (CheckBox) findViewById(R.id.selectallID);

        SelectAllListener listener = new SelectAllListener();
        selectallBox.setOnCheckedChangeListener(listener);
    }

    class SelectAllListener implements CompoundButton.OnCheckedChangeListener{


        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               eatBox.setChecked(isChecked);
               // or eatBox.setChecked(true)
               sleepBox.setChecked(isChecked);
               dotaBox.setChecked(isChecked);
                }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);

    }
}
