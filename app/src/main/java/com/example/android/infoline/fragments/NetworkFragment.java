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
import com.example.android.infoline.network.AirtelActivity;
import com.example.android.infoline.network.BSNLActivity;
import com.example.android.infoline.network.DoCoMoActivity;
import com.example.android.infoline.network.IdeaActivity;
import com.example.android.infoline.network.RelianceActivity;
import com.example.android.infoline.network.VodaActivity;

public class NetworkFragment extends Fragment {
    public NetworkFragment() {

    }

    public void onCrete(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState
        );
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = (View) inflater.inflate(R.layout.fragment_network, container, false);
        ListView networkList = view.findViewById(R.id.networkList);
        String[] networkItem = {"", "", "Airtel", "BSNL", "DoCoMo", "Idea", "Reliance", "Vodaphone"};
        ArrayAdapter<String> networkAdapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                networkItem
        );
        networkList.setAdapter(networkAdapter);
        networkList.setOnItemClickListener(onListClick);
        return view;
    }

    AdapterView.OnItemClickListener onListClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
            Log.v("clicked", (String) ((TextView) v).getText());
            String txtValue = ((TextView) v).getText().toString();
            switch (txtValue) {
                case "Airtel":
                    startActivity(new Intent(v.getContext(), AirtelActivity.class));
                    break;

                case "BSNL":
                    startActivity(new Intent(v.getContext(), BSNLActivity.class));
                    break;
                case "DoCoMo":
                    startActivity(new Intent(v.getContext(), DoCoMoActivity.class));
                    break;
                case "Idea":
                    startActivity(new Intent(v.getContext(), IdeaActivity.class));
                    break;
                case "Reliance":
                    startActivity(new Intent(v.getContext(), RelianceActivity.class));
                    break;
                case "Vodaphone":
                    startActivity(new Intent(v.getContext(), VodaActivity.class));
                    break;

            }
        }
    };
}
