package com.example.android.infoline.bank;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.android.infoline.R;

import java.util.ArrayList;

public class IciciActivity extends AppCompatActivity {

    Toolbar toolbar;
    IciciAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icici);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if(getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        ListView list = (ListView) findViewById(R.id.iciciList);
        String[] sports = getResources().getStringArray(R.array.iciciCode);
        ArrayList<String> myData = new ArrayList<String>();

        for(int i = 0; i<sports.length;i++) {
            myData.add(sports[i]);
        }

        adapter = new IciciAdapter(this,myData);
        list.setAdapter(adapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();


        return super.onOptionsItemSelected(item);
    }
}
