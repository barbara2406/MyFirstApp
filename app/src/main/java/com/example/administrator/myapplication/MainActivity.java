package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int cont =0;
    TextView text;
    Button result;

    public void init(){
        result =  (Button)findViewById(R.id.result);

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent res = new Intent(MainActivity.this, Result.class);
                res.putExtra("RESULT", cont);
                startActivity(res);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button less = (Button) findViewById(R.id.less);
        Button more = (Button) findViewById(R.id.more);
        text = (TextView) findViewById(R.id.cont);

        more.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                cont++;
                text.setText(Integer.toString(cont));
            }
        });

        less.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cont--;
                text.setText(Integer.toString(cont));
            }
        });

        init();
    }
}
