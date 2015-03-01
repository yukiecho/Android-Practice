package com.example.chuncuiyuki.s01e09;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends ActionBarActivity {

    private RadioGroup radioGroup;
    private RadioButton femaleb;
    private RadioButton maleb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        radioGroup = (RadioGroup) findViewById(R.id.radioGroupid);
        femaleb = (RadioButton) findViewById(R.id.femaleButtonid);
        maleb = (RadioButton) findViewById(R.id.maleButtonid);

        RadioGroupListener listener = new RadioGroupListener();
        radioGroup.setOnCheckedChangeListener(listener);

    }

    class RadioGroupListener implements RadioGroup.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if(checkedId == femaleb.getId()){
                System.out.println("选中了female！！");
            }
            else if(checkedId == maleb.getId()){
                System.out.println("选中了male");
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
