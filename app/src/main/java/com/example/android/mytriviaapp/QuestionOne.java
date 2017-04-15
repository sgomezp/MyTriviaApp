package com.example.android.mytriviaapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.android.mytriviaapp.R.id.answer3;
import static com.example.android.mytriviaapp.R.id.answer4;

public class QuestionOne extends AppCompatActivity {

    static final String STATE_QUESTION_1 = "stateQuestion1";
    static final String STATE_QUESTION_2 = "stateQuestion2";
    static final String STATE_QUESTION_3 = "stateQuestion3";
    static final String STATE_QUESTION_4 = "stateQuestion4";
    static final String STATE_QUESTION_51 = "stateQuestion51";
    static final String STATE_QUESTION_52 = "stateQuestion52";
    static final String STATE_QUESTION_53 = "stateQuestion53";
    static final String STATE_QUESTION_54 = "stateQuestion54";
    static final String STATE_QUESTION_61 = "stateQuestion61";
    static final String STATE_QUESTION_62 = "stateQuestion62";
    static final String STATE_QUESTION_63 = "stateQuestion63";
    static final String STATE_QUESTION_64 = "stateQuestion64";
    static final String STATE_QUESTION_7 = "stateQuestion7";
    private static final String STATE_FINAL_SCORE = "valueOfFinalScore";
    int finalScore = 0;
    int answerRG1;
    int answerRG2;
    int answerRG7;
    String answerQuestion3;
    String answerQuestion4;
    Boolean IsCheckanswerQuestion51;
    Boolean IsCheckanswerQuestion52;
    Boolean IsCheckanswerQuestion53;
    Boolean IsCheckanswerQuestion54;
    Boolean IsCheckanswerQuestion61;
    Boolean IsCheckanswerQuestion62;
    Boolean IsCheckanswerQuestion63;
    Boolean IsCheckanswerQuestion64;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);
    }


    @Override
    public void onSaveInstanceState(Bundle saveInstanceState) {
        super.onSaveInstanceState(saveInstanceState);
        getUserAnswers();
        saveInstanceState.putInt(STATE_FINAL_SCORE, finalScore);
        saveInstanceState.putInt(STATE_QUESTION_1, answerRG1);
        saveInstanceState.putInt(STATE_QUESTION_2, answerRG2);
        saveInstanceState.putInt(STATE_QUESTION_7, answerRG7);
        saveInstanceState.putString(STATE_QUESTION_3, answerQuestion3);
        saveInstanceState.putString(STATE_QUESTION_4, answerQuestion4);
        saveInstanceState.putBoolean(STATE_QUESTION_51, IsCheckanswerQuestion51);
        saveInstanceState.putBoolean(STATE_QUESTION_52, IsCheckanswerQuestion52);
        saveInstanceState.putBoolean(STATE_QUESTION_53, IsCheckanswerQuestion53);
        saveInstanceState.putBoolean(STATE_QUESTION_54, IsCheckanswerQuestion54);
        saveInstanceState.putBoolean(STATE_QUESTION_61, IsCheckanswerQuestion61);
        saveInstanceState.putBoolean(STATE_QUESTION_62, IsCheckanswerQuestion62);
        saveInstanceState.putBoolean(STATE_QUESTION_63, IsCheckanswerQuestion63);
        saveInstanceState.putBoolean(STATE_QUESTION_64, IsCheckanswerQuestion64);

    }

    public void onRestoreInstanceState(Bundle saveInstanceState) {
        finalScore = saveInstanceState.getInt(STATE_FINAL_SCORE);
        answerRG1 = saveInstanceState.getInt(STATE_QUESTION_1);
        answerRG2 = saveInstanceState.getInt(STATE_QUESTION_2);
        answerRG7 = saveInstanceState.getInt(STATE_QUESTION_7);
        answerQuestion3 = saveInstanceState.getString(STATE_QUESTION_3);
        answerQuestion4 = saveInstanceState.getString(STATE_QUESTION_4);
        IsCheckanswerQuestion51 = saveInstanceState.getBoolean(STATE_QUESTION_51);
        IsCheckanswerQuestion52 = saveInstanceState.getBoolean(STATE_QUESTION_52);
        IsCheckanswerQuestion53 = saveInstanceState.getBoolean(STATE_QUESTION_53);
        IsCheckanswerQuestion54 = saveInstanceState.getBoolean(STATE_QUESTION_54);
        IsCheckanswerQuestion61 = saveInstanceState.getBoolean(STATE_QUESTION_61);
        IsCheckanswerQuestion62 = saveInstanceState.getBoolean(STATE_QUESTION_62);
        IsCheckanswerQuestion63 = saveInstanceState.getBoolean(STATE_QUESTION_63);
        IsCheckanswerQuestion64 = saveInstanceState.getBoolean(STATE_QUESTION_64);
        setUserAnswer();

    }

    public void getUserAnswers() {
        RadioGroup radioB1 = (RadioGroup) findViewById(R.id.question1);
        answerRG1 = radioB1.getCheckedRadioButtonId();

        RadioGroup radioB2 = (RadioGroup) findViewById(R.id.question2);
        answerRG2 = radioB2.getCheckedRadioButtonId();

        RadioGroup radioB7 = (RadioGroup) findViewById(R.id.question7);
        answerRG7 = radioB7.getCheckedRadioButtonId();

        EditText editT3 = (EditText) findViewById(answer3);
        answerQuestion3 = editT3.getText().toString();

        EditText editT4 = (EditText) findViewById(answer4);
        answerQuestion4 = editT4.getText().toString();

        CheckBox checkB51 = (CheckBox) findViewById(R.id.answer5_1);
        IsCheckanswerQuestion51 = checkB51.isChecked();

        CheckBox checkB52 = (CheckBox) findViewById(R.id.answer5_2);
        IsCheckanswerQuestion52 = checkB52.isChecked();

        CheckBox checkB53 = (CheckBox) findViewById(R.id.answer5_3);
        IsCheckanswerQuestion53 = checkB53.isChecked();

        CheckBox checkB54 = (CheckBox) findViewById(R.id.answer5_4);
        IsCheckanswerQuestion54 = checkB54.isChecked();

        CheckBox checkB61 = (CheckBox) findViewById(R.id.answer6_1);
        IsCheckanswerQuestion61 = checkB61.isChecked();

        CheckBox checkB62 = (CheckBox) findViewById(R.id.answer6_2);
        IsCheckanswerQuestion62 = checkB62.isChecked();

        CheckBox checkB63 = (CheckBox) findViewById(R.id.answer6_3);
        IsCheckanswerQuestion63 = checkB63.isChecked();

        CheckBox checkB64 = (CheckBox) findViewById(R.id.answer6_4);
        IsCheckanswerQuestion64 = checkB64.isChecked();
    }

    public void setUserAnswer() {
        if (answerRG1 == (R.id.answer1_1) | answerRG1 == (R.id.answer1_2)
                | answerRG1 == (R.id.answer1_3) | answerRG1 == (R.id.answer1_4)) {
            RadioButton AnswerRadioB1 = (RadioButton) findViewById(answerRG1);
            AnswerRadioB1.setChecked(true);
        }

        if (answerRG2 == (R.id.answer2_1) | answerRG2 == (R.id.answer2_2)
                | answerRG2 == (R.id.answer2_3) | answerRG1 == (R.id.answer2_4)) {
            RadioButton AnswerRadioB2 = (RadioButton) findViewById(answerRG2);
            AnswerRadioB2.setChecked(true);
        }

        EditText answerET3 = (EditText) findViewById(answer3);
        answerET3.setText(answerQuestion3);

        EditText answerET4 = (EditText) findViewById(answer4);
        answerET4.setText(answerQuestion4);

        CheckBox answerCB51 = (CheckBox) findViewById(R.id.answer5_1);
        answerCB51.setChecked(IsCheckanswerQuestion51);

        CheckBox answerCB52 = (CheckBox) findViewById(R.id.answer5_2);
        answerCB52.setChecked(IsCheckanswerQuestion52);

        CheckBox answerCB53 = (CheckBox) findViewById(R.id.answer5_3);
        answerCB53.setChecked(IsCheckanswerQuestion53);

        CheckBox answerCB54 = (CheckBox) findViewById(R.id.answer5_4);
        answerCB54.setChecked(IsCheckanswerQuestion54);

        CheckBox answerCB61 = (CheckBox) findViewById(R.id.answer6_1);
        answerCB61.setChecked(IsCheckanswerQuestion61);

        CheckBox answerCB62 = (CheckBox) findViewById(R.id.answer6_2);
        answerCB62.setChecked(IsCheckanswerQuestion62);

        CheckBox answerCB63 = (CheckBox) findViewById(R.id.answer6_3);
        answerCB63.setChecked(IsCheckanswerQuestion63);

        CheckBox answerCB64 = (CheckBox) findViewById(R.id.answer6_4);
        answerCB64.setChecked(IsCheckanswerQuestion64);

        if (answerRG7 == (R.id.answer7_1) | answerRG7 == (R.id.answer7_2)
                | answerRG7 == (R.id.answer7_3) | answerRG7 == (R.id.answer7_4)) {
            RadioButton AnswerRadioB7 = (RadioButton) findViewById(answerRG7);
            AnswerRadioB7.setChecked(true);
        }
    }

    /* Display the final score
    * Using a Toast
    */
    public void displayScore() {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        String msg = context.getString(R.string.scoreMessage) + finalScore + context.getString(R.string.scoreMessage1);
        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();
    }

    public void CalculateScore(View view) {
//      Check answer number 1. If correct add 1 to finalScore
        RadioButton correctAnswer1 = (RadioButton) findViewById(R.id.answer1_1);
        if (correctAnswer1.isChecked()) {
            finalScore += 1;
        }

//      Check answer number 2. If correct add 1 to finalScore
        RadioButton correctAnswer2 = (RadioButton) findViewById(R.id.answer2_3);
        if (correctAnswer2.isChecked()) {
            finalScore += 1;
        }

//      Check answer number 3. If correct add 1 to finalScore
        EditText Answer3 = (EditText) findViewById(answer3);
        String correctAnswer3 = Answer3.getText().toString();
        if (correctAnswer3.equals("1969")) {
            finalScore += 1;
        }

//      Check answer number 4. If correct add 1 to finalScore
        EditText Answer4 = (EditText) findViewById(answer4);
        String correctAnswer4 = Answer4.getText().toString();
        if (correctAnswer4.contains("Moon") | correctAnswer4.contains("Luna")) {
            finalScore += 1;
        }

//     Check answer number 5. If correct add 1 to finalScore
        CheckBox answer51 = (CheckBox) findViewById(R.id.answer5_1);
        CheckBox answer52 = (CheckBox) findViewById(R.id.answer5_2);
        CheckBox answer53 = (CheckBox) findViewById(R.id.answer5_3);
        CheckBox answer54 = (CheckBox) findViewById(R.id.answer5_4);
        if (answer51.isChecked()) {
            if (answer52.isChecked()) {
                if (answer53.isChecked()) {
                    if (!answer54.isChecked()) {
                        finalScore += 1;
                    }
                }
            }

        }

//      Check answer number 6. If correct add 1 to finalScore
        CheckBox answer61 = (CheckBox) findViewById(R.id.answer6_1);
        CheckBox answer62 = (CheckBox) findViewById(R.id.answer6_2);
        CheckBox answer63 = (CheckBox) findViewById(R.id.answer6_3);
        CheckBox answer64 = (CheckBox) findViewById(R.id.answer6_4);
        if (!answer62.isChecked()) {
            if (answer61.isChecked()) {
                if (answer63.isChecked()) {
                    if (answer64.isChecked()) {
                        finalScore += 1;
                    }
                }
            }

        }

//      Check answer number 7. If correct add 1 to finalScore
        RadioButton correctAnswer7 = (RadioButton) findViewById(R.id.answer7_3);
        if (correctAnswer7.isChecked()) {
            finalScore += 1;
        }

//      Display a toast with the score result
        ImageView smyle = (ImageView) findViewById(R.id.smiles);
        if (finalScore <= 3) {
            smyle.setImageResource(R.drawable.sad_smiley_face);
            smyle.setVisibility(View.VISIBLE);
        } else {
            if (finalScore <= 6) {
                smyle.setImageResource(R.drawable.smiling_face_open_mouth);
                smyle.setVisibility(View.VISIBLE);
            } else {
                if (finalScore == 7) {
                    smyle.setImageResource(R.drawable.thumbs_up);
                    smyle.setVisibility(View.VISIBLE);
                }
            }
        }
        displayScore();
        finalScore = 0; // Reset score
    }

    public void StartOver(View view) {
        //  Back to the main screen
        finalScore = 0; // Reset score
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
