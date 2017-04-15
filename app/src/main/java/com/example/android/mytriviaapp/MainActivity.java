package com.example.android.mytriviaapp;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    Locale myLocale;
    String idioma;
    private Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //addListenerOnButton();
        addListenerOnSpinnerItemSelection();

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        // .. create or get your new Locale object here.

    /* if (spinner.getSelectedItemPosition() == 0){
          idioma = "en";
      }else {
          if (spinner.getSelectedItemPosition() == 1){
              idioma = "es";
          }
      }*/


        super.attachBaseContext(MyContextWrapper.wrap(newBase, idioma));
        Context context = ContextWrapper.wrap(newBase, myLocale);
        super.attachBaseContext(context);
    }


    public void addListenerOnSpinnerItemSelection() {
        spinner = (Spinner) findViewById(R.id.langs);

        spinner.setOnItemSelectedListener(new CustomOnItemSelectedListener());

    }

    public void buttonNext(View view) {
        Intent intent = new Intent(this, QuestionOne.class);
        startActivity(intent);
    }


}
