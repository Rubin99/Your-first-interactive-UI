package com.example.HelloConstraints;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button btnCount;
    private Button btnZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        btnCount = (Button) findViewById(R.id.button_count);
        btnZero = (Button) findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        if (mCount % 2 == 0){
            btnCount.setBackgroundColor(getResources().getColor(R.color.teal_200));
        }

        else {
            btnCount.setBackgroundColor(getResources().getColor(R.color.red));
        }
        if (mCount > 0){
            btnZero.setBackgroundColor(getResources().getColor(R.color.yellow));
        }
    }

    public void zero(View view) {
        mShowCount.setText("0");
        mCount = 0;
        btnZero.setBackgroundColor(getResources().getColor(R.color.gray));
        }


    }
