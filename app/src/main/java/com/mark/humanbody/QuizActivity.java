package com.mark.humanbody;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class QuizActivity extends AppCompatActivity {
    String rightAnswer;
    TextView txt_question, txt_timer, txt_score, txt_counter;
    Button cmd_a, cmd_b, cmd_c, cmd_d;
    public static ArrayList<Question_model> set;// = new ArrayList<Question_model>();
    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle("Quiz");
        txt_score = (TextView) findViewById(R.id.txt_Score);
        txt_timer = (TextView) findViewById(R.id.txt_timer);
        txt_question = (TextView) findViewById(R.id.txt_question);
        txt_counter = (TextView) findViewById(R.id.txt_counter);
        cmd_a = (Button) findViewById(R.id.cmd_optiona);
        cmd_b = (Button) findViewById(R.id.cmd_optionb);
        cmd_c = (Button) findViewById(R.id.cmd_optionc);
        cmd_d = (Button) findViewById(R.id.cmd_optiond);
        set = new ArrayList<Question_model>();

        if (variables.set.contains("A")) {
            set = utils.setA;
        } else {
            set = utils.setB;
        }
        Collections.shuffle(set);
        Collections.addAll(set);
        updateImageQuestion(utils.currentQ);

        countDownTimer = new CountDownTimer(300000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                long durationSeconds = millisUntilFinished / 1000;
                txt_timer.setText(String.format("%02d:%02d:%02d", durationSeconds / 3600, (durationSeconds % 3600) / 60, (durationSeconds % 60)));
            }

            @Override
            public void onFinish() {
                startActivity(new Intent(getApplicationContext(), ResultActivity.class));
                overridePendingTransition(0, 0);
                finish();
            }
        }.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        countDownTimer.cancel();

    }

    public void updateImageQuestion(int questionIndex) {


        if (questionIndex >= 25) {
            startActivity(new Intent(getApplicationContext(), ResultActivity.class));
            overridePendingTransition(0, 0);
            finish();
        } else {
            txt_question.setText(set.get(questionIndex).getQuestion());
            cmd_a.setText(set.get(questionIndex).getA());
            cmd_b.setText(set.get(questionIndex).getB());
            cmd_c.setText(set.get(questionIndex).getC());
            cmd_d.setText(set.get(questionIndex).getD());
            rightAnswer = set.get(questionIndex).getAnswer();
        }


    }

    public void cmd_option_Clicked(View view) {
        Button b = (Button) view;
        checkQuestion(b.getText().toString());


    }

    public void checkQuestion(String userAnswer) {

        if (rightAnswer.contains(String.valueOf(userAnswer.charAt(0)))) {
            utils.score++;
            txt_score.setText("Score: " + utils.score);

        }
        if (utils.currentQ == 1) {
            answerInfo.answersArrayList.add(new Answer(utils.currentQ, userAnswer.toString().charAt(0) + "", rightAnswer));
        }
        utils.currentQ = utils.currentQ + 1;
        txt_counter.setText(utils.currentQ + "/25");
        updateImageQuestion(utils.currentQ);
        answerInfo.answersArrayList.add(new Answer(utils.currentQ, userAnswer.toString().charAt(0) + "", rightAnswer));

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                back();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    void back() {
        utils.currentQ = 1;
        startActivity(new Intent(getApplicationContext(), QuizMenuActivity.class));
        overridePendingTransition(0, 0);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        back();
    }
}
