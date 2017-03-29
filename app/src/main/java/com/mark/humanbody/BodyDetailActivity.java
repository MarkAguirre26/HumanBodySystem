package com.mark.humanbody;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import me.biubiubiu.justifytext.library.JustifyTextView;

public class BodyDetailActivity extends AppCompatActivity {
    int index = 0;
    ImageView img_body;
    TextView txt_bodyName, txt_itemCounter;
    private int[] object;
    private String[] objectName, objectDefinitions;
    ScrollView scrollView;
    JustifyTextView txt_bodyDefinition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_detail);
        init();


    }

    private void init() {
        object = new int[]{};
        objectName = new String[]{};
        objectDefinitions = new String[]{};
        if (variables.isSearch == true) {
            index = variables.humanBodyIndex - 1;
        }else{
            index = variables.humanBodyIndex;
        }

        scrollView = (ScrollView) findViewById(R.id.scroll);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        this.setTitle(variables.categoryName);
        img_body = (ImageView) findViewById(R.id.img_body);
        txt_bodyName = (TextView) findViewById(R.id.txt_bodyName);

        txt_bodyDefinition = (JustifyTextView) findViewById(R.id.txt_bodyDefinition);
        txt_itemCounter = (TextView) findViewById(R.id.txt_itemCounter);


        switch (variables.categoryTag) {
            case 1:
                object = bodyImages.AuditorySystem;
                objectName = bodyImages.AuditorySystem_name;
                objectDefinitions = bodyImages.AuditorySystem_value;
                break;
            case 2:
                object = bodyImages.CirculatorySystem;
                objectName = bodyImages.CirculatorySystem_name;
                objectDefinitions = bodyImages.CirculatorySystem_value;
                break;
            case 3:
                object = bodyImages.DigestiveSystem;
                objectName = bodyImages.DigestiveSystem_name;
                objectDefinitions = bodyImages.DigestiveSystem_value;
                break;
            case 4:
                object = bodyImages.EndocrineSystem;
                objectName = bodyImages.EndocrineSystem_name;
                objectDefinitions = bodyImages.EndocrineSystem_value;
                break;
            case 5:
                object = bodyImages.ImmuneLymphaticSystem;
                objectName = bodyImages.ImmuneLymphaticSystem_name;
                objectDefinitions = bodyImages.ImmuneLymphaticSystem_value;
                break;
            case 6:
                object = bodyImages.IntegumentarySystem;
                objectName = bodyImages.IntegumentarySystem_name;
                objectDefinitions = bodyImages.IntegumentarySystem_value;
                break;
            case 7:
                object = bodyImages.NervousSystem;
                objectName = bodyImages.NervousSystem_name;
                objectDefinitions = bodyImages.NervousSystem_value;
                break;
            case 8:
                object = bodyImages.ReproductiveSystem_female;
                objectName = bodyImages.ReproductiveSystem_female_name;
                objectDefinitions = bodyImages.ReproductiveSystem_female_value;
                break;
            case 9:
                object = bodyImages.ReproductiveSystem_male;
                objectName = bodyImages.ReproductiveSystem_male_name;
                objectDefinitions = bodyImages.ReproductiveSystem_male_value;
                break;
            case 10:
                object = bodyImages.RespiratorySystem;
                objectName = bodyImages.RespiratorySystem_name;
                objectDefinitions = bodyImages.RespiratorySystem_value;
                break;
            case 11:
                object = bodyImages.SkeletalSystem;
                objectName = bodyImages.SkeletalSystem_name;
                objectDefinitions = bodyImages.SkeletalSystem_value;
                break;
            case 12:
                object = bodyImages.UrinarySystem;
                objectName = bodyImages.UrinarySystem_name;
                objectDefinitions = bodyImages.UrinarySystem_value;
            default:
              //  Toast.makeText(getApplicationContext(),variables.categoryTag+"",Toast.LENGTH_LONG).show();
                object = bodyImages.UrinarySystem;
                objectName = bodyImages.UrinarySystem_name;
                objectDefinitions = bodyImages.UrinarySystem_value;
        }
        if (index > 0) {
            txt_itemCounter.setVisibility(View.GONE);
        }

        setContent();

    }

    private void toRight() {
        if (index < object.length - 1) {
            index++;
        }
        setContent();
    }

    private void toLeft() {
        if (index >= 1) {
            index--;
        }
        setContent();
    }

    public void cmd_control_Clicked(View view) {
        Button b = (Button) view;
        int i = Integer.valueOf(b.getTag().toString());
        if (i == 1) {
            toLeft();
        } else if (i == 2) {
            toRight();
        }
    }

    private void setContent() {

        img_body.setImageResource(object[index]);
        img_body.setTag(object[index]);
        txt_bodyName.setText(objectName[index]);
        txt_bodyDefinition.setText(objectDefinitions[index]);
        txt_itemCounter.setText((index + 1) + "/" + object.length + "");

    }

    public void cmd_reference_Clicked(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org"));
        startActivity(browserIntent);
    }

    public void img_view_Clicked(View view) {
        variables.imageTag = (int) img_body.getTag();
        startActivity(new Intent(getApplicationContext(), ZoomImageActivity.class));
        overridePendingTransition(0, 0);
        //    finish();
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

        if(variables.isSearch == true){
            startActivity(new Intent(getApplicationContext(), CategoryActivity.class));
        }else{
            startActivity(new Intent(getApplicationContext(), SubcategoryActivity.class));
        }
        variables.isSearch = false;
        overridePendingTransition(0, 0);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        back();
    }
}
