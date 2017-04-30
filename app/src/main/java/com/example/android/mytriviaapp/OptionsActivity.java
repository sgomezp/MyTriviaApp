package com.example.android.mytriviaapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;

import java.util.Locale;


public class OptionsActivity extends AppCompatActivity implements OnItemSelectedListener {

    static final String STATE_LANGUAGE = "English";

    Spinner langSpinner;
    Locale myLocale;
    String idio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);

        //Spinner element
        langSpinner = (Spinner) findViewById(R.id.langs);

        //Spinner Click listener
        langSpinner.setOnItemSelectedListener(this);

    }


    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        // Save the user's current language state
        savedInstanceState.putString(STATE_LANGUAGE, idio);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onRestoreInstanceState(Bundle saveInstanceState) {

        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(saveInstanceState);

        // Restore state members from saved instance
        idio = saveInstanceState.getString(STATE_LANGUAGE);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

        idio = (String) langSpinner.getItemAtPosition(pos);


        if (idio.equals("English")) {


            setLocale("en");


        } else if (idio.equals("Español")) {

            setLocale("es");
        }

    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }


    public void applyLanguage(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void setLocale(String idioma) {
        myLocale = new Locale(idioma);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
    }
}
