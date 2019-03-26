package com.example.infoscreentest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

   // private Button mapButton;

//This is the first activity and where the initial array is created. From here it will pass the contents of the array to inBetween.java. I did this to simulate the
    //the movement from the search screen to the map screen and then to the info screen. BUT I think we could do away from this if
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initial creating of string variables, these would be what we gathered from the query.
        String name = "Bananas";
        String price = "$3.45";
        String quantity = "4";
        String type = "2";

        //Putting all of the strings gathered into a string array.
        String[] itemInfo = {name, price, quantity, type};

        //Calling the bellow function that will pass the newly created array to the inBetween.
        passArray(itemInfo);

       // mapButton = (Button) findViewById(R.id.button);
       // mapButton.setOnClickListener(new View.OnClickListener(){
       //     @Override
        //    public void onClick(View v){
        //        launchMap();
        //    }
       // });

    }


    public void passArray(String [] beesKnees){
       //inBetween here is the destination where we are sending the array
        Intent intent = new Intent(this, inBetween.class);

        //This putExtra command works in junction with the getExtra in the inBetween to send and gather the array.
        intent.putExtra("itemInfo", beesKnees);

        startActivity(intent);
    }

   // public void launchMap() {
    //    Intent intent = new Intent(this, inBetween.class);
    //    startActivity(intent);
   // }

}

