package com.example.chuncuiyuki.s01e09;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;


public class MainActivity extends ActionBarActivity{

//end here
//create a variable for log.i
// whether it's click or unclick, we can use the "isChecked" method under box objects
   // private static final String LOG_TAG = "debug";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox eatBox = (CheckBox) findViewById(R.id.eatID);
        CheckBox sleepBox = (CheckBox) findViewById(R.id.sleepID);
        CheckBox dotaBox = (CheckBox)findViewById(R.id.dotaID);

        OnBoxClickListener listener = new OnBoxClickListener();
        eatBox.setOnClickListener(listener);
        sleepBox.setOnClickListener(listener);
        dotaBox.setOnClickListener(listener);
    }

//OnclickListener is a method
    // view = eatBox
    class OnBoxClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            CheckBox box = (CheckBox)view;
            if (view.getId()==R.id.eatID)
            {
                System.out.println("eatBox");
            }
            else if(view.getId()==R.id.sleepID) {
                System.out.println("sleep");
            }
            else if(view.getId()==R.id.dotaID) {
                System.out.println("dota");
            }
            if (box.isChecked()) {
                System.out.println("checked");
            }
            else {
                System.out.println("unchecked");
            }
    //view.getId: you have view bt you want to get id, its adverse to findViewById

        }
    }

//end


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
