package com.mark.humanbody;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CategoryActivity extends AppCompatActivity implements RecognitionListener {
    ListView lv;
    ArrayList<Item> i = new ArrayList<>();
    EditText txt_search;
    private final int REQ_CODE_SPEECH_INPUT = 100;

    private ToggleButton toggleButton;
    private ProgressBar progressBar;
    private SpeechRecognizer speech = null;
    private Intent recognizerIntent;
    private String LOG_TAG = "result";
    ProgressDialog progressDialog;
    String[] list_1, list_2, list_3, list_4, list_5, list_6, list_7, list_8, list_9, list_10, list_11, list_12, list_13, list_14, list_15, list_16, list_17, list_18, list_19, list_20, list_21, list_22, list_23, list_24, list_25, list_26, list_27, list_28, list_29, list_30, list_31, list_32, list_33, list_34, list_35, list_36, list_37, list_38, list_39, list_40, list_41, list_42, list_43, list_44, list_45, list_46, list_47, list_48, list_49;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        init();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                variables.categoryTag = Integer.valueOf(((TextView) view.findViewById(R.id.textView)).getTag().toString());
                variables.categoryName = ((TextView) view.findViewById(R.id.textView)).getText().toString();
                if (variables.isSearch == true) {
                    variables.humanBodyIndex = Integer.valueOf(((TextView) view.findViewById(R.id.txt_itemCount)).getText().toString().replace("(", "").replace(")", ""));
                    startActivity(new Intent(getApplicationContext(), BodyDetailActivity.class));
                } else {
                    variables.humanBodyIndex = 0;
                    startActivity(new Intent(getApplicationContext(), SubcategoryActivity.class));
                }


                overridePendingTransition(0, 0);
                finish();

            }
        });
    }


    private void init() {
        this.setTitle("Category");
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Speak Now");
        txt_search = (EditText) findViewById(R.id.txt_search);
        lv = (ListView) findViewById(R.id.simpleListView);


        progressBar = (ProgressBar) findViewById(R.id.progressBar_g1a2);
        toggleButton = (ToggleButton) findViewById(R.id.cmd_voice);


        //toggleButton.setVisibility(View.INVISIBLE);
        // progressBar.setVisibility(View.INVISIBLE);
        speech = SpeechRecognizer.createSpeechRecognizer(this);
        speech.setRecognitionListener(this);
        recognizerIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        recognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_PREFERENCE,
                "en");
        recognizerIntent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE,
                this.getPackageName());
        recognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_WEB_SEARCH);
        recognizerIntent.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 3);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) {
                    progressDialog.show();
                    // toggleButton.setVisibility(View.INVISIBLE);
                    toggleButton.setBackgroundResource(R.drawable.button_voice);

                    progressBar.setVisibility(View.VISIBLE);
                    progressBar.setIndeterminate(true);
                    speech.startListening(recognizerIntent);
                } else {
                    progressDialog.dismiss();
                    // toggleButton.setVisibility(View.VISIBLE);
                    toggleButton.setBackgroundResource(R.drawable.voice_green);
                    progressBar.setIndeterminate(false);
                    progressBar.setVisibility(View.INVISIBLE);
                    speech.stopListening();
                }
            }
        });


        list_1 = new String[]{"Kashmir", " Cattleya", " Garcia", " Godzilla", " Cashmere"};
        list_2 = new String[]{"incose", " Ingles", " ingo's", " it goes", " and goes"};
        list_3 = new String[]{"malice", " Molly's", " mattress", " Malley's", " modest"};
        list_4 = new String[]{"stapes", " Vapes", " States", " tapes", " shapes"};
        list_5 = new String[]{"tympanic membrane"};
        list_6 = new String[]{"abdominal aorta", " abdominal Alta", " abdominal Auto", " abdominal Alto", " abdominal Arthur"};
        list_7 = new String[]{"anterior tibial artery", " Ontario tibial artery"};
        list_8 = new String[]{"ancillary artery", " ancillary arteries", " NC Lottery", " auxiliary artery", " Anthony artery"};
        list_9 = new String[]{"sabolich Bean", " sabolich beam", " sepilok Bean", " sabolich Bang", " set Pollack Bean"};
        list_10 = new String[]{"great shape no Spain", " great shape a nose ring", " wait Sarpino's Bang", " wait Supino's Bang", " wait Supino's Bean"};
        list_11 = new String[]{"Rachel artery", " Rachael artery", " Rachel archery", " Rachel arteries", " Rachel Lottery"};
        list_12 = new String[]{"what are artery", " what a liar artery", " what are arteries", " what an artery", " what are our artery"};
        list_13 = new String[]{"honest", " anise", " Anna's", " anos", " panels",};
        list_14 = new String[]{"Jenny olaes", " Jamie olaes", " Danny olaes", " Daniel Osos", " Jennie olaes"};
        list_15 = new String[]{"explain a stoma", " a splint is Tomah", " a splint is stoma", " a splint is Toma", " explain this Toma"};
        list_16 = new String[]{"song", " tongue", " Tom", " thong", " bong"};
        list_17 = new String[]{"Palkia", " Takia", " Top Gear", " call Kia", " trakia"};
        list_18 = new String[]{"Ariana Grande", " Danielle Glenn", " Enneagram", " Danielle Glen", " Indiana Grand"};
        list_19 = new String[]{"famous blonde", " famous blind", " famous planned"};
        list_20 = new String[]{"lumbar from", " lumbar ROM", " lombar from", " lumbar", " lumbar Trump"};
        list_21 = new String[]{"Hermes", " Denny's", " dummies", " Journeys"};
        list_22 = new String[]{"no", " new", " now", " nerve", " know"};
        list_23 = new String[]{"Topanga snow", " tipping your snow", " Japan yes no", " Superior snow", " Japan yes now"};
        list_24 = new String[]{"static nerve", " aesthetic nerve", " scatec nerve", " is Catholic nerve", " is Katic nerve"};
        list_25 = new String[]{"Foreigner", " for Honor", " $4", " foreigners", " 4Runner"};
        list_26 = new String[]{"photos", " fondos", " windows", " fundos", " Footloose"};
        list_27 = new String[]{"Butera's", " youth arrows", " cute arrows", " terros", " guilt arrows"};
        list_28 = new String[]{"APD mrs.", " APD misses", " epididymitis", " MPD mrs.", " epidemius"};
        list_29 = new String[]{"Benny's", " panties", " Penney's", " Danny's", " Penny's"};
        list_30 = new String[]{"Estes", " Estus", " SS", " test test", " Festus"};
        list_31 = new String[]{"Florence", " Clarence", " flowering", " flooring", " larynx"};
        list_32 = new String[]{"long", " lung", " langue", " wrong", " lawn"};
        list_33 = new String[]{"City Auto Sales", " care sinus", " are sinus", " cre sinus", " pre sinus"};
        list_34 = new String[]{"Nassau partings", " Nacho partings", " Massaponax", " NASA partings", " nacho party"};
        list_35 = new String[]{"Arrow pairings", " Aero pairings", " Aro pairings", " Arrow power rings", " aeroponics"};
        list_36 = new String[]{"turkey", " talkie", " Chucky", " talking", " talky"};
        list_37 = new String[]{"Ebola", " moolah", " Lula", " hula"};
        list_38 = new String[]{"homophone", " homemade poem", " homemade bomb", " Comet poem", " Comet phone"};
        list_39 = new String[]{"Hill Meadows", " Phil Meadows", " he'll Meadows", " Bill Meadows", " Jill Meadows"};
        list_40 = new String[]{"alien", " Ilium", " ileum", " helium", " allium"};
        list_41 = new String[]{"a vehicle Arbonne", " my vehicle Arbonne", " vehicle Arbonne", " my vehicle are bone", " a vehicle a bone"};
        list_42 = new String[]{"capella", " cappella", " apella", " Pop-A-Lock", " capela"};
        list_43 = new String[]{"courageous", " wages", " rages", " Bridges", " gauges"};
        list_44 = new String[]{"is Kyle", " is car", " is cod", " iscar", " is call", "Chicago", " scholar", " scar", " skull", " Scala"};
        list_45 = new String[]{"Chris Pine", " spying", " aspyn", " spine", " Spain"};
        list_46 = new String[]{"Palace", " Dallas", " Palos", " callous", " Talos"};
        list_47 = new String[]{"tip", " tape", " cape", " pip", " hip"};
        list_48 = new String[]{"Pro labs", " true ribs", " proverbs", " throw ribs", " Pro ribs"};
        list_49 = new String[]{"hola", " ola", " Orla", " Olaf", " Lola"};


        i.add(new Item("Auditory System", R.drawable.auditory_logo, 1, bodyImages.AuditorySystem.length));
        i.add(new Item("Circulatory System", R.drawable.circulatory_logo, 2, bodyImages.CirculatorySystem.length));
        i.add(new Item("Digestive System", R.drawable.digestive_logo, 3, bodyImages.DigestiveSystem.length));
        i.add(new Item("Endocrine System", R.drawable.endocrine_logo, 4, bodyImages.EndocrineSystem.length));
        i.add(new Item("Immune Lymphatic System", R.drawable.immune_logo, 5, bodyImages.ImmuneLymphaticSystem.length));
        i.add(new Item("Integumentary System", R.drawable.integumentary_logo, 6, bodyImages.IntegumentarySystem.length));
        i.add(new Item("Nervous System", R.drawable.nervous_logo, 7, bodyImages.NervousSystem.length));
        i.add(new Item("Reproductive System(female)", R.drawable.reproductive_female_logo, 8, bodyImages.ReproductiveSystem_female.length));
        i.add(new Item("Reproductive System(male)", R.drawable.reproductive_male_logo, 9, bodyImages.ReproductiveSystem_male.length));
        i.add(new Item("Respiratory System", R.drawable.respiratory_logo, 10, bodyImages.RespiratorySystem.length));
        i.add(new Item("Skeletal System", R.drawable.skeletal_logo, 11, bodyImages.SkeletalSystem.length));
        i.add(new Item("Urinary System", R.drawable.urinary_logo, 12, bodyImages.UrinarySystem.length));
        MyAdapter myAdapter = new MyAdapter(this, R.layout.layout_category, i);
        lv.setAdapter(myAdapter);
        progressDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                progressBar.setIndeterminate(true);
                toggleButton.setChecked(false);
            }
        });
        txt_search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                ArrayList<Item> arrayList = new ArrayList<Item>();
                if (txt_search.getText().length() > 0) {
                    for (int a = 0; a <= bodyImages.allBodySystem_name.length - 2; a++) {
                        if (bodyImages.allBodySystem_name[a].toLowerCase().contains(txt_search.getText().toString().toLowerCase())) {
                            arrayList.add(new Item(bodyImages.allBodySystem_name[a], R.drawable.favicon, bodyImages.allBodySystem_index[a], bodyImages.allBodySystem_no[a]));

                        }
                    }

                    variables.isSearch = true;
                    MyAdapter myAdapter = new MyAdapter(CategoryActivity.this, R.layout.layout_category, arrayList);
                    lv.setAdapter(myAdapter);
                } else {

                    variables.isSearch = false;
                    MyAdapter myAdapter = new MyAdapter(CategoryActivity.this, R.layout.layout_category, i);
                    lv.setAdapter(myAdapter);
                }
                if (arrayList.size() <= 0 && txt_search.getText().length() > 0) {
                    Snackbar.make(findViewById(android.R.id.content), "NO MATCH FOUND", Snackbar.LENGTH_SHORT).setActionTextColor(Color.RED).show();
                }


            }

            @Override
            public void afterTextChanged(Editable s) {

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
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        overridePendingTransition(0, 0);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        back();
    }


    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (speech != null) {
            speech.destroy();
            Log.i(LOG_TAG, "destroy");
        }

    }


    @Override
    public void onBeginningOfSpeech() {
        Log.i(LOG_TAG, "onBeginningOfSpeech");
        progressBar.setIndeterminate(false);
        progressBar.setMax(10);
    }

    @Override
    public void onBufferReceived(byte[] buffer) {
        Log.i(LOG_TAG, "onBufferReceived: " + buffer);
    }

    @Override
    public void onEndOfSpeech() {
        Log.i(LOG_TAG, "onEndOfSpeech");
        progressBar.setIndeterminate(true);
        toggleButton.setChecked(false);
        progressDialog.dismiss();
    }

    @Override
    public void onError(int errorCode) {
        String errorMessage = getErrorText(errorCode);
        Log.d(LOG_TAG, "FAILED " + errorMessage);
        // returnedText.setText(errorMessage);
        toggleButton.setChecked(false);
        progressDialog.dismiss();
        toggleButton.setVisibility(View.VISIBLE);
    }

    @Override
    public void onEvent(int arg0, Bundle arg1) {
        Log.i(LOG_TAG, "onEvent");
    }

    @Override
    public void onPartialResults(Bundle arg0) {
        Log.i(LOG_TAG, "onPartialResults");
    }

    @Override
    public void onReadyForSpeech(Bundle arg0) {
        Log.i(LOG_TAG, "onReadyForSpeech");
    }

    @Override
    public void onResults(Bundle results) {

        // toggleButton.setVisibility(View.VISIBLE);
        ArrayList<String> matches = results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
        List<String> list1 = Arrays.asList(list_1);
        List<String> list2 = Arrays.asList(list_2);
        List<String> list3 = Arrays.asList(list_3);
        List<String> list4 = Arrays.asList(list_4);
        List<String> list5 = Arrays.asList(list_5);
        List<String> list6 = Arrays.asList(list_6);
        List<String> list7 = Arrays.asList(list_7);
        List<String> list8 = Arrays.asList(list_8);
        List<String> list9 = Arrays.asList(list_9);
        List<String> list10 = Arrays.asList(list_10);
        List<String> list11 = Arrays.asList(list_11);
        List<String> list12 = Arrays.asList(list_12);
        List<String> list13 = Arrays.asList(list_13);
        List<String> list14 = Arrays.asList(list_14);
        List<String> list15 = Arrays.asList(list_15);
        List<String> list16 = Arrays.asList(list_16);
        List<String> list17 = Arrays.asList(list_17);
        List<String> list18 = Arrays.asList(list_18);
        List<String> list19 = Arrays.asList(list_19);
        List<String> list20 = Arrays.asList(list_20);
        List<String> list21 = Arrays.asList(list_21);
        List<String> list22 = Arrays.asList(list_22);
        List<String> list23 = Arrays.asList(list_23);
        List<String> list24 = Arrays.asList(list_24);
        List<String> list25 = Arrays.asList(list_25);
        List<String> list26 = Arrays.asList(list_26);
        List<String> list27 = Arrays.asList(list_27);
        List<String> list28 = Arrays.asList(list_28);
        List<String> list29 = Arrays.asList(list_29);
        List<String> list30 = Arrays.asList(list_30);
        List<String> list31 = Arrays.asList(list_31);
        List<String> list32 = Arrays.asList(list_32);
        List<String> list33 = Arrays.asList(list_33);
        List<String> list34 = Arrays.asList(list_34);
        List<String> list35 = Arrays.asList(list_35);
        List<String> list36 = Arrays.asList(list_36);
        List<String> list37 = Arrays.asList(list_37);
        List<String> list38 = Arrays.asList(list_38);
        List<String> list39 = Arrays.asList(list_39);
        List<String> list40 = Arrays.asList(list_40);
        List<String> list41 = Arrays.asList(list_41);
        List<String> list42 = Arrays.asList(list_42);
        List<String> list43 = Arrays.asList(list_43);
        List<String> list44 = Arrays.asList(list_44);
        List<String> list45 = Arrays.asList(list_45);
        List<String> list46 = Arrays.asList(list_46);
        List<String> list47 = Arrays.asList(list_47);
        List<String> list48 = Arrays.asList(list_48);
        List<String> list49 = Arrays.asList(list_49);

        for (String result : matches) {
            try {
                Thread.sleep(200);
                Log.d("sagot", result);
                if (list1.contains(result)) {
                    txt_search.setText("cochlea");
                    break;
                } else if (list2.contains(result)) {
                    txt_search.setText("incus");
                    break;
                } else if (list3.contains(result)) {
                    txt_search.setText("malleus");
                    break;
                } else if (list4.contains(result)) {
                    txt_search.setText("stapes ");
                    break;
                } else if (list5.contains(result)) {
                    txt_search.setText("tymphanic membrane");
                    break;
                } else if (list6.contains(result)) {
                    txt_search.setText("abdominal aorta ");
                    break;
                } else if (list7.contains(result)) {
                    txt_search.setText("anterior tibial artery ");
                    break;
                } else if (list8.contains(result)) {
                    txt_search.setText("axillary artery");
                    break;
                } else if (list9.contains(result)) {
                    txt_search.setText("cephalic vein ");
                    break;
                } else if (list10.contains(result)) {
                    txt_search.setText("great saphenous vein");
                    break;
                } else if (list11.contains(result)) {
                    txt_search.setText("radial artery");
                    break;
                } else if (list12.contains(result)) {
                    txt_search.setText("ulnar artery");
                    break;
                } else if (list13.contains(result)) {
                    txt_search.setText("anus");
                    break;
                } else if (list14.contains(result)) {
                    txt_search.setText("genioglossus ");
                    break;
                } else if (list15.contains(result)) {
                    txt_search.setText("spleen Stomach ");
                    break;
                } else if (list16.contains(result)) {
                    txt_search.setText("tongue");
                    break;
                } else if (list17.contains(result)) {
                    txt_search.setText("trachea ");
                    break;
                } else if (list18.contains(result)) {
                    txt_search.setText("ineal gland ");
                    break;
                } else if (list19.contains(result)) {
                    txt_search.setText("thymus gland");
                    break;
                } else if (list20.contains(result)) {
                    txt_search.setText("lumbar trunk ");
                    break;
                } else if (list21.contains(result)) {
                    txt_search.setText("dermis");
                    break;
                } else if (list22.contains(result)) {
                    txt_search.setText("nerve");
                    break;
                } else if (list23.contains(result)) {
                    txt_search.setText("saphenous nerve");
                    break;
                } else if (list24.contains(result)) {
                    txt_search.setText("sciatic nerve");
                    break;
                } else if (list25.contains(result)) {
                    txt_search.setText("sural nerve ");
                    break;
                } else if (list26.contains(result)) {
                    txt_search.setText("fundus");
                    break;
                } else if (list27.contains(result)) {
                    txt_search.setText("uterus");
                    break;
                } else if (list28.contains(result)) {
                    txt_search.setText("epididymis");
                    break;
                } else if (list29.contains(result)) {
                    txt_search.setText("penis");
                    break;
                } else if (list30.contains(result)) {
                    txt_search.setText("testes");
                    break;
                } else if (list31.contains(result)) {
                    txt_search.setText("larynx ");
                    break;
                } else if (list32.contains(result)) {
                    txt_search.setText("lung");
                    break;
                } else if (list33.contains(result)) {
                    txt_search.setText("maxillary sinus");
                    break;
                } else if (list34.contains(result)) {
                    txt_search.setText("nasopharynx ");
                    break;
                } else if (list35.contains(result)) {
                    txt_search.setText("orapharynx ");
                    break;
                } else if (list36.contains(result)) {
                    txt_search.setText("trachea");
                    break;
                } else if (list37.contains(result)) {
                    txt_search.setText("fibula");
                    break;
                } else if (list38.contains(result)) {
                    txt_search.setText("hamate bone");
                    break;
                } else if (list39.contains(result)) {
                    txt_search.setText("humerus");
                    break;
                } else if (list40.contains(result)) {
                    txt_search.setText("ilium");
                    break;
                } else if (list41.contains(result)) {
                    txt_search.setText("navicular bone");
                    break;
                } else if (list42.contains(result)) {
                    txt_search.setText("patella");
                    break;
                } else if (list43.contains(result)) {
                    txt_search.setText("radius");
                    break;
                } else if (list44.contains(result)) {
                    txt_search.setText("skull ");
                    break;
                } else if (list45.contains(result)) {
                    txt_search.setText("talus ");
                    break;
                } else if (list46.contains(result)) {
                    txt_search.setText("teeth ");
                    break;
                } else if (list47.contains(result)) {
                    txt_search.setText("true ribs");
                    break;
                } else if (list48.contains(result)) {
                    txt_search.setText("ulna");
                    break;
                } else if (list49.contains(result)) {
                    txt_search.setText("ureter");
                    break;
                } else {
                    txt_search.setText(matches.get(0));
                    Log.d("sagot", result);
                    break;
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        progressDialog.dismiss();
        // txt_search.setText(matches.toString().replace("[","").replace("]",""));
        Log.i(LOG_TAG, matches.toString());
    }

    private void checkAnswer(ArrayList<String> matches) {


    }

    @Override
    public void onRmsChanged(float rmsdB) {
        Log.i(LOG_TAG, "onRmsChanged: " + rmsdB);
        progressBar.setProgress((int) rmsdB);
    }


    public static String getErrorText(int errorCode) {
        String message;
        switch (errorCode) {
            case SpeechRecognizer.ERROR_AUDIO:
                message = "Audio recording error";
                break;
            case SpeechRecognizer.ERROR_CLIENT:
                message = "Client side error";
                break;
            case SpeechRecognizer.ERROR_INSUFFICIENT_PERMISSIONS:
                message = "Insufficient permissions";
                break;
            case SpeechRecognizer.ERROR_NETWORK:
                message = "Network error";
                break;
            case SpeechRecognizer.ERROR_NETWORK_TIMEOUT:
                message = "Network timeout";
                break;
            case SpeechRecognizer.ERROR_NO_MATCH:
                message = "No match";
                break;
            case SpeechRecognizer.ERROR_RECOGNIZER_BUSY:
                message = "RecognitionService busy";
                break;
            case SpeechRecognizer.ERROR_SERVER:
                message = "error from server";
                break;
            case SpeechRecognizer.ERROR_SPEECH_TIMEOUT:
                message = "No speech input";
                break;
            default:
                message = "Didn't understand, please try again.";
                break;
        }
        return message;
    }

}
