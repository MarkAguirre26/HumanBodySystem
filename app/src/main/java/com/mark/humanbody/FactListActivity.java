package com.mark.humanbody;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FactListActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<FactModel> i = new ArrayList<>();
  //  EditText txt_search;
    private final int REQ_CODE_SPEECH_INPUT = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        init();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                facts.factIndex = Integer.valueOf(((TextView) view.findViewById(R.id.textView)).getTag().toString());
                facts.factName = ((TextView) view.findViewById(R.id.textView)).getText().toString();
                startActivity(new Intent(getApplicationContext(), FactActivity.class));
                overridePendingTransition(0, 0);
                finish();

            }
        });
    }
/*

    public void cmd_voice_Clicked(View view) {
        promptSpeechInput();
    }
*/

    private void init() {
        this.setTitle("Facts");
       // txt_search = (EditText) findViewById(R.id.txt_search);
        lv = (ListView) findViewById(R.id.simpleListView);
        i.add(new FactModel(R.drawable.aging, "Aging and Death", 1));
        i.add(new FactModel(R.drawable.body, "Bodily Functions", 2));
        i.add(new FactModel(R.drawable.disease, "Disease and Injury", 3));
        i.add(new FactModel(R.drawable.hair_logo, "Hair and Nails", 4));
        i.add(new FactModel(R.drawable.internalcarotidartery_logo, "Internal Organ", 5));
        i.add(new FactModel(R.drawable.microscopic, "Microscopic Level", 6));
        i.add(new FactModel(R.drawable.digestive_logo, "Miscellaneous", 7));
        i.add(new FactModel(R.drawable.nervous_logo, "Muscles and Bones", 8));
        i.add(new FactModel(R.drawable.reproductive, "Reproduction", 9));
        i.add(new FactModel(R.drawable.senses, "Senses", 10));
        i.add(new FactModel(R.drawable.brain_res, "The Brain", 11));
        FactAdapter factAdapter = new FactAdapter(this, R.layout.layout_fact, i);
        lv.setAdapter(factAdapter);

       /* txt_search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                ArrayList<FactModel> arrayList = new ArrayList<FactModel>();
                for (int i_ = 0; i_ <= i.size() - 1; i_++) {
                    if (i.get(i_).factname.contains(txt_search.getText().toString())) {
                        arrayList.add(new FactModel(i.get(i_).getImage(),i.get(i_).getFactname(),i.get(i_).getTag()));
                    }
                    FactAdapter factAdapter = new FactAdapter(FactListActivity.this, R.layout.layout_fact, arrayList);
                    lv.setAdapter(factAdapter);
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });*/
    }

    /*private void promptSpeechInput() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                getString(R.string.speech_prompt));
        try {
            startActivityForResult(intent, REQ_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(getApplicationContext(),
                    getString(R.string.speech_not_supported),
                    Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case REQ_CODE_SPEECH_INPUT: {
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    txt_search.setText(result.get(0));
                }
                break;
            }

        }
    }*/

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
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        overridePendingTransition(0, 0);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        back();
    }
}
