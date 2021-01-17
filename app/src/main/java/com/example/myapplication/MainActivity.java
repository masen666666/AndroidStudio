package com.example.myapplication;

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
//        R.id.hello;
        setTitle("Home");
    }

    public void disable(View v){
        View myView = findViewById(R.id.button3);
        myView.setEnabled(false);
        Button button = (Button) myView;
        button.setText("New Disabled");

//        v.setEnabled(false);
////        Log.d("success","Button Disabled");  // then use Logcat to search the tag
//        Button button = (Button) v;
//        button.setText("Disabled");
    }

    public void handleText(View v){
        EditText t = findViewById(R.id.source);
        String input = t.getText().toString();
        ((TextView)findViewById(R.id.output)).setText(input);
        Log.d("info",input);
        Toast.makeText(this,"Alert",Toast.LENGTH_LONG).show();


    }

    public void launchSettings(View v){
        //launch a new activity

        Intent i = new Intent(this, SettingsActivity.class); // this- main activity
        String message = ((EditText)findViewById(R.id.source)).getText().toString();
        i.putExtra("COOL",message);
        startActivity(i);
    }
}