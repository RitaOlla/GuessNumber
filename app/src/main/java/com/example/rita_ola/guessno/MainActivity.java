package com.example.rita_ola.guessno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;


    public void makeToast(String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
    public void guess(View view){

        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);

        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        if(guessInt > randomNumber){
            makeToast("Lower");
            //show(randomNumber);
        } else if(guessInt < randomNumber) {
            makeToast("Higher");
            //show(randomNumber);
        } else {
            makeToast("That's right! Try again!");
            //Random rand = new Random();
            //randomNumber = rand.nextInt(20) + 1;
            randomNumber = (int) (Math.random()*21);
        }
    }

    public void show(int randNumber){
        String r = Integer.toString(randNumber);
        makeToast(r);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();

        randomNumber = rand.nextInt(20) + 1;
    }
}
