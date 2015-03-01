package com.example.chuncuiyuki.s01e09;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox eatBox = (CheckBox) findViewById(R.id.eatID);
        CheckBox sleepBox = (CheckBox) findViewById(R.id.sleepID);
        CheckBox dotaBox = (CheckBox) findViewById(R.id.dotaID);

        CheckListener listener = new CheckListener();
        eatBox.setOnCheckedChangeListener(listener);
        sleepBox.setOnCheckedChangeListener(listener);
        dotaBox.setOnCheckedChangeListener(listener);

        class CheckListener implements CompoundButton.OnCheckedChangeListener {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(buttonView.getId() == R.id.eatID)
                {
                    System.out.println("eee");
                }
                else if(buttonView.getId() == R.id.sleepID){
                    System.out.println("ssss");

                }
                else if(buttonView.getId() == R.id.dotaID){
                    System.out.println("ddddd");
            }
                if(isChecked) {
                    System.out.println("cccccheck");
                }
                else {
                    System.out.println("unnncheck");
                }
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

    private class CheckBoxListener {
    }
