package com.example.infoscreentest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class inBetween extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_between);

        Bundle extras = getIntent().getExtras();

        String[] itemInfo = extras.getStringArray("itemInfo");

        for(String item:itemInfo) {
            if (itemInfo[1] == item) {
                itemInfo[1] = "$4.45";
            }
        }
       // passingThrough(itemInfo);
    }

    public void passingThrough(String[] items){
        Intent intent = new Intent(this, infoScreen.class);

        intent.putExtra("itemInfo", items);
        startActivity(intent);
    }
}
