package com.example.dell.work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    int count=0;
    Button a;
    EditText p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(Button)findViewById(R.id.update);
        p=(EditText)findViewById(R.id.disp);;
        p.setEnabled(false);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                p.setText(Integer.toString(count));
            }
        });

    }

}
