package com.mark.humanbody;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tools.setFullScreen(this);
    }

    public void cmd_category_Clcked(View view) {
        Button b = (Button) view;
        int i = Integer.valueOf(b.getTag().toString());
        if (i == 1) {
            startActivity(new Intent(getApplicationContext(), CategoryActivity.class));
        }
        if (i == 2) {
            startActivity(new Intent(getApplicationContext(), QuizMenuActivity.class));
        }
        if (i == 3) {
            startActivity(new Intent(getApplicationContext(), FactListActivity.class));
        }

        overridePendingTransition(0, 0);
        finish();
    }

    @Override
    public void onBackPressed() {
       // super.onBackPressed();
        new AlertDialog.Builder(this)
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        System.exit(0);
                    }
                })
                .setNegativeButton("No", null)
                .show();
    }
}
