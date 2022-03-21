package com.sam.firstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleText(View v) {
        /*Button button = findViewById(R.id.button);
        button.setEnabled(false);
        */
        //setEnabled(false);
        EditText text = findViewById(R.id.source);
        String input = text.getText().toString();
        ((TextView)findViewById(R.id.output)).setText(input);
        Toast.makeText(this, input + " est enregistré", Toast.LENGTH_LONG).show();

    }
}