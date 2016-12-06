package com.example.vovab.labrab5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mytext;
    Button mybutton;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytext = (TextView)findViewById(R.id.MyTextView);
        mybutton = (Button)findViewById(R.id.MyButton);
        OnClickListener myClick = new OnClickListener() {
            public void onClick(View view) {
                count++;
                mytext.setText("Кнопка была нажата " + count + "раз");
            }
        };
        mybutton.setOnClickListener(myClick);
    }
}
