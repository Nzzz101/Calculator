package com.threez101210.calcutatorfor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText en1,en2;
    public TextView rt;
    public Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        en1 =(EditText) findViewById(R.id.en1);
        en2 =(EditText)findViewById(R.id.en2);
        rt =(TextView) findViewById(R.id.rt);
        b1 =(Button) findViewById(R.id.b1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temp1 = Integer.parseInt(en1.getText().toString());
                int temp2 = Integer.parseInt(en2.getText().toString());
                int sum = temp1 + temp2;
                rt.setText("Answer =   " + String.valueOf(sum));
            }
        });
    }
}