package com.gitmad.handleevents;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView namePrompt;
    private EditText nameEditText;
    private Button xmlButton;
    private Button javaButton;
    private Button toastButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the UI objects from the activity_main.xml file. Two of the buttons are done
        // for you.
        javaButton = (Button) findViewById(R.id.java_button);
        toastButton = (Button) findViewById(R.id.toast_button);

        javaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Extract the user's name from the text box and save it in a variable

                // The Log class is very handy when debugging. To make sure you have the correct
                // value in your variable, log the username to the Android Monitor here with Log.i()

                // Create a new intent that will take the user from this activity to OtherActivity

                // To pass data from one class to another, we use "extras". We want OtherActivity
                // to know what the user's name is, so add a string extra to the intent.

                // using the intent you just created, start a new instance of OtherActivity.

            }
        });

        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Make a toast that welcomes the user based on what they enter in the text box.
                //Once the toast is made, don't forget to show it!


            }
        });
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Go to AndroidManifest.xml and follow the instructions in the comments. When you are done,
        // return here and implement the java

        // Using newConfig, determine if the phone is in portrait or landscape mode and print
        // a toast message to the user telling them which orientation the phone is in.

    }

    /*
     * This method gets called when the xmlButton is selected
     */
    public void xmlSubmit(View view) {
        // Extract the user's name from the text box and save it in a variable

        // The Log class is very handy when debugging. To make sure you have the correct
        // value in your variable, log the username to the Android Monitor here with Log.i()

        // Create a new intent that will take the user from this activity to OtherActivity

        // To pass data from one class to another, we use "extras". We want OtherActivity
        // to know what the user's name is, so add a string extra to the intent.

        // using the intent you just created, start a new instance of OtherActivity.

    }

    // Extra Challenge: Prevent any the buttons from working if the user does not enter their name
}
