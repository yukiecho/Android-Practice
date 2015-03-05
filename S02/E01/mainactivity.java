package com.example.chuncuiyuki.s02;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.butid);

        ButtonListener listener = new ButtonListener();
        button.setOnClickListener(listener);
    }

    class ButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent = new Intent();
            //setClass函数的第一个参数是一个context对象
            //context是一个类，activity是context类的一个子类
            //也就是说，所有的activity对象都可以向上转型成context对象
            //第二个是一个class对象，在当前场景下应该传入需要被启动的activity的对象
            intent.setClass(MainActivity.this,secondactivity.class);
            startActivity(intent);
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
