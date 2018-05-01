package com.example.android.infoline.bank;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.android.infoline.R;
import com.example.android.infoline.network.AirtelAdapter;

import java.util.ArrayList;

public class AxisActivity extends AppCompatActivity {

    Toolbar toolbar;
    AxisAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_axis);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if(getSupportActionBar()!= null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        ListView list = (ListView) findViewById(R.id.axisList);
        String[] sports = getResources().getStringArray(R.array.axisCode);
        ArrayList<String> myData = new ArrayList<String>();

        for(int i = 0; i<sports.length;i++) {
            myData.add(sports[i]);
        }

        adapter = new AxisAdapter(this,myData);
        list.setAdapter(adapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();


        return super.onOptionsItemSelected(item);
    }
}
