package com.example.android.infoline.bank;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.infoline.R;

import java.util.ArrayList;

public class SbiAdapter extends ArrayAdapter<String> {

    private ArrayList<String> list = new ArrayList<String>();
    private Context context;

    public SbiAdapter(Context context, ArrayList<String> records) {
        super(context, 0, records);
        this.context = context;

    }

    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        final String item = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.ussd_layout, parent, false);
        }
        final TextView list_Txt = (TextView) convertView.findViewById(R.id.txtDef);
        Button list_But = (Button) convertView.findViewById(R.id.btnCall);

        list_Txt.setText(item.replaceAll("[^A-Za-z]", " "));

        //Log.v("Airtelclicked", (String) ((TextView) convertView).getText());

        list_But.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("Value before Clicked", item.toString());
                String number = item.replaceAll("[A-Za-z]", "");

                Log.v("Value after Clicked", number.toString());
                Intent i = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("tel:" + number));
                context.startActivity(i);
            }

        });


        return convertView;
    }
}
