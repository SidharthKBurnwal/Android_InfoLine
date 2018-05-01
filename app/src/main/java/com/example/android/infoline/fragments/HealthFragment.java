package com.example.android.infoline.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.infoline.R;
import com.example.android.infoline.activity.AccidentActivity;
import com.example.android.infoline.activity.CancerActivity;
import com.example.android.infoline.activity.DepressionActivity;
import com.example.android.infoline.activity.DiabetiesActivity;
import com.example.android.infoline.activity.HIVActivity;
import com.example.android.infoline.activity.PeriodsActivity;
import com.example.android.infoline.activity.RapeActivity;

public class HealthFragment extends Fragment {

    public HealthFragment() {

    }

    public void onCrete(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_health, container, false);
        String[] healthItem = {"", "", "Cancer", "Depression", "Diabeties", "HIV", "Periods", "Rape", "Road Accident"};
        ListView healthListView = view.findViewById(R.id.healthList);

        ArrayAdapter<String> healathAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                healthItem
        );

        healthListView.setAdapter(healathAdapter);
        healthListView.setOnItemClickListener(onListClick);

        return view;
    }

    AdapterView.OnItemClickListener onListClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
            Log.v("clicked", (String) ((TextView) v).getText());
            String textValue = ((TextView) v).getText().toString();
            switch (textValue) {
                case "Cancer":
                    startActivity(new Intent(v.getContext(), CancerActivity.class));
                    break;
                case "Depression":
                    startActivity(new Intent(v.getContext(), DepressionActivity.class));
                    break;
                case "Diabeties":
                    startActivity(new Intent(v.getContext(), DiabetiesActivity.class));
                    break;
                case "Rape":
                    startActivity(new Intent(v.getContext(), RapeActivity.class));
                    break;
                case "Road Accident":
                    startActivity(new Intent(v.getContext(), AccidentActivity.class));
                    break;
                case "HIV":
                    startActivity(new Intent(v.getContext(), HIVActivity.class));
                    break;
                case "Periods":
                    startActivity(new Intent(v.getContext(), PeriodsActivity.class));
                    break;

            }


        }
    };


}
