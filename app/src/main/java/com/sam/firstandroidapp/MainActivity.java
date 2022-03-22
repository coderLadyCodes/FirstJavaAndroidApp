package com.sam.firstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        setTitle("Home");
    }

    /*
    public void handleText(View v) {
        /*Button button = findViewById(R.id.button);
        button.setEnabled(false);

        //setEnabled(false);
        EditText text = findViewById(R.id.source);
        String input = text.getText().toString();
        ((TextView)findViewById(R.id.output)).setText(input);
        Toast.makeText(this, input + " est enregistré", Toast.LENGTH_LONG).show();
*/
    //}


            public void launchSettings(View v){
                Intent intent = new Intent(this, SettingsActivity.class);
                String message = ((EditText)findViewById(R.id.editText)).getText().toString();
                intent.putExtra("COOL", message);
                startActivity(intent);
        }
}