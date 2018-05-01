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
import com.example.android.infoline.bank.AxisActivity;
import com.example.android.infoline.bank.BobActivity;

public class BankFragment extends Fragment{
    public BankFragment(){

    }

    public void onCrete(Bundle savedInstanceState){
        super.onCreate(savedInstanceState
        );
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = (View)inflater.inflate(R.layout.fragment_bank, container, false);
        String[] bankItem = {"","","AXIS","BANK OF BARODA","HDFC","ICICI","PNB","SBI"};
        ListView bankListView = view.findViewById(R.id.bankList);

        ArrayAdapter<String> bankAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                bankItem
        );
        bankListView.setAdapter(bankAdapter);
        bankListView.setOnItemClickListener(onListClick);

        return view;
    }

    AdapterView.OnItemClickListener onListClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
            Log.v("clicked", (String) ((TextView) v).getText());
            String textValue = ((TextView) v).getText().toString();
            switch (textValue) {
                case "AXIS":
                    startActivity(new Intent(v.getContext(), AxisActivity.class));
                    break;
                case "BANK OF BARODA":
                    startActivity(new Intent(v.getContext(), BobActivity.class));
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
