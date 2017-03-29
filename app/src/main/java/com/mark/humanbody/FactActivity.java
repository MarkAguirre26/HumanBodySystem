package com.mark.humanbody;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;

public class FactActivity extends AppCompatActivity {
    int index = 0;

    private String[] objectName, objectDefinitions;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact);
        init();


    }

    private void init() {
        lv = (ListView) findViewById(R.id.lv);
        objectName = new String[]{};
        objectDefinitions = new String[]{};

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle(facts.factName);


        switch (facts.factIndex) {
            case 1:

                objectName = facts.aginganddeath_subject;
                objectDefinitions = facts.aginganddeath_definitions;
                break;
            case 2:

                objectName = facts.bodilyfunctions_subject;
                objectDefinitions = facts.bodilyfunctions_definitions;
                break;
            case 3:

                objectName = facts.diseaseandinjury_subject;
                objectDefinitions = facts.diseaseandinjury_definitions;
                break;
            case 4:

                objectName = facts.hairandnails_subject;
                objectDefinitions = facts.hairandnails_definitions;
                break;
            case 5:

                objectName = facts.internalorgan_subject;
                objectDefinitions = facts.internalorgan_definitions;
                break;
            case 6:

                objectName = facts.microscopiclevel_subject;
                objectDefinitions = facts.microscopiclevel_definitions;
                break;
            case 7:
                objectName = facts.miscellaneous_subject;
                objectDefinitions = facts.miscellaneous_definitions;
                break;
            case 8:
                objectName = facts.musclesandBones_subject;
                objectDefinitions = facts.musclesandBones_definitions;
                break;
            case 9:
                objectName = facts.reproduction_subject;
                objectDefinitions = facts.reproduction_definitions;
                break;
            case 10:

                objectName = facts.senses_subject;
                objectDefinitions = facts.senses_definitions;
                break;
            case 11:

                objectName = facts.theBrain_subject;
                objectDefinitions = facts.theBrain_definitions;
                break;

            default:

                objectName = facts.aginganddeath_subject;
                objectDefinitions = facts.aginganddeath_definitions;
        }
        ArrayList<Itemfacts> arrayItems = new ArrayList<>();

        for (int i = 0; i < objectName.length - 1; i++) {
            arrayItems.add(new Itemfacts(objectName[i], objectDefinitions[i]));
        }
        FactDefAdapter myAdapter = new FactDefAdapter(this, R.layout.row_facts, arrayItems);
        lv.setAdapter(myAdapter);

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
        startActivity(new Intent(getApplicationContext(), FactListActivity.class));
        overridePendingTransition(0, 0);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        back();
    }
}
