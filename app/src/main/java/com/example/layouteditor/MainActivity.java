package com.example.layouteditor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.RED;

public class MainActivity extends AppCompatActivity {

    private TextView mShowCount;
    private int mCount = 0;
    private Button zerobutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = (TextView) findViewById(R.id.show_count);
        zerobutton = (Button)findViewById(R.id.zero);
    }

    public void countUp(View view) {
        ++mCount;
        zerobutton.setBackgroundColor(Color.MAGENTA);
        if (mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));}
        if (mCount % 2 == 0){
            view.setBackgroundColor(Color.GREEN);}
        else {
            view.setBackgroundColor(RED);}
    }

    public void show_toast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();

    }

    public void zero(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        if(mCount==0){
        view.setBackgroundColor(Color.GRAY);}
    }
}