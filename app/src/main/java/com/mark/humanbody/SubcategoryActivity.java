package com.mark.humanbody;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SubcategoryActivity extends AppCompatActivity {
    TextView txt_header;
    ListView lv;

    private String[] objectName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subcategory);
        init();

    }

    private void init() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        objectName = new String[]{};
        this.setTitle(R.string.app_name);
        txt_header = (TextView) findViewById(R.id.txt_header);
        lv = (ListView) findViewById(R.id.lv);


      /*  if (variables.isSearch == true) {
            index = variables.humanBodyIndex - 1;
        }*/

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle(R.string.app_name);
        txt_header.setText(variables.categoryName);

        switch (variables.categoryTag) {
            case 1:

                objectName = bodyImages.AuditorySystem_name;

                break;
            case 2:

                objectName = bodyImages.CirculatorySystem_name;

                break;
            case 3:

                objectName = bodyImages.DigestiveSystem_name;

                break;
            case 4:

                objectName = bodyImages.EndocrineSystem_name;

                break;
            case 5:

                objectName = bodyImages.ImmuneLymphaticSystem_name;

                break;
            case 6:

                objectName = bodyImages.IntegumentarySystem_name;

                break;
            case 7:

                objectName = bodyImages.NervousSystem_name;

                break;
            case 8:

                objectName = bodyImages.ReproductiveSystem_female_name;

                break;
            case 9:

                objectName = bodyImages.ReproductiveSystem_male_name;

                break;
            case 10:

                objectName = bodyImages.RespiratorySystem_name;

                break;
            case 11:

                objectName = bodyImages.SkeletalSystem_name;

                break;
            case 12:

                objectName = bodyImages.UrinarySystem_name;

            default:
                //  Toast.makeText(getApplicationContext(),variables.categoryTag+"",Toast.LENGTH_LONG).show();

                objectName = bodyImages.UrinarySystem_name;

        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, objectName);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //variables.categoryTag = position;
                //variables.categoryName = ((TextView) view.findViewById(R.id.rowTextView)).getText().toString();

                variables.humanBodyIndex = position;
                startActivity(new Intent(getApplicationContext(), BodyDetailActivity.class));
                overridePendingTransition(0, 0);
                finish();

            }
        });
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
        startActivity(new Intent(getApplicationContext(), CategoryActivity.class));
        overridePendingTransition(0, 0);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        back();
    }
}
