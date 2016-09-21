package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        //Create an arraylist of colors
        ArrayList<Word> family = new ArrayList<Word>();

        family.add(new Word(R.drawable.family_father, "father", "әpә"));
        family.add(new Word(R.drawable.family_mother, "mother", "әṭa"));
        family.add(new Word(R.drawable.family_son, "son", "angsi"));
        family.add(new Word(R.drawable.family_daughter, "daughter", "tune"));
        family.add(new Word(R.drawable.family_older_brother, "older brother", "taachi"));
        family.add(new Word(R.drawable.family_younger_brother, "younger brother", "chalitti"));
        family.add(new Word(R.drawable.family_older_sister, "older sister", "teṭe"));
        family.add(new Word(R.drawable.family_younger_sister, "younger sister", "kolliti"));
        family.add(new Word(R.drawable.family_grandmother, "grandmother", "ama"));
        family.add(new Word(R.drawable.family_grandfather, "grandfather", "paapa"));

        WordAdapter adapter = new WordAdapter(this, family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
