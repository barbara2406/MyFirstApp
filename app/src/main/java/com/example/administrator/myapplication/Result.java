package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    int res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        res = getIntent().getExtras().getInt("RESULT");
        TextView result = (TextView) findViewById(R.id.result);
        result.setText(Integer.toString(res));
    }


}
