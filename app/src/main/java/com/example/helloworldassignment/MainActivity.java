package com.example.helloworldassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button;
TextView textName;
EditText personName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        personName=(EditText)findViewById(R.id.personName);
        button=(Button)findViewById(R.id.button);
        textName=(TextView)findViewById(R.id.textName);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=personName.getText().toString();
                textName.setText("Hi " +name);
            }
        });

    }
}