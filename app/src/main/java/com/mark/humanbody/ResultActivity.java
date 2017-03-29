package com.mark.humanbody;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends Activity {
    TextView txt_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Tools.setFullScreen(this);
        this.setTitle("Result");
        txt_score = (TextView) findViewById(R.id.txt_score);
        txt_score.setText(utils.score + "/25");
    }
public  void  cmd_viewAnswers_Clicked(View view){
    startActivity(new Intent(getApplicationContext(), AnswersActivity.class));
    overridePendingTransition(0, 0);
}
    public void cmd_result_Clicked(View view) {

        Button b = (Button) view;
        int i = Integer.valueOf(b.getTag().toString());
        if (i == 1) {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            extra();
        } else if (i == 2) {
            startActivity(new Intent(getApplicationContext(), QuizActivity.class));
            extra();
        } else if (i == 3) {

            new AlertDialog.Builder(this)
                    .setMessage("Are you sure you want to exit?")
                    .setCancelable(false)
                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                            System.exit(0);
                            extra();
                        }
                    })
                    .setNegativeButton("No", null)
                    .show();

        }

    }

    void extra(){
        utils.score=0;
        utils.currentQ = 1;
        utils.currentPoints=0;
        answerInfo.answersArrayList.clear();
        overridePendingTransition(0, 0);
        finish();
    }
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
    }
}
