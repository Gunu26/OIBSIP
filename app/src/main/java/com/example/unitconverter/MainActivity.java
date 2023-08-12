package com.example.unitconverter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private View button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.text);
        editText=findViewById(R.id.number);
        button=findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String s=editText.getText().toString();
                int kg=Integer.parseInt(s);
                double pound = 2.205 * kg;
                textView.setText("The value in Pounds is: "+pound);
            }
        });

    }
}