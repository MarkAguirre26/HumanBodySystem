package com.mark.humanbody;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class AnswersActivity extends Activity {

    ListView list;
    AnswersAdapter adapter;
    public AnswersActivity CustomListView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers);
        Tools.setFullScreen(this);

        list = (ListView) findViewById(R.id.lv_answers);
        refreshList();


    }
    void refreshList() {
        CustomListView = this;

        adapter = new AnswersAdapter(CustomListView, answerInfo.answersArrayList);
        list.setAdapter(adapter);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

      // tools.clearAnswers(this);


    }

    public void cmd_Answers_Clicked(View view) {
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
       // tools.clearAnswers(this);
        finish();
    }
}
