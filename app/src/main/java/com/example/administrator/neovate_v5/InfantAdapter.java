package com.example.administrator.neovate_v5;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Administrator on 12/27/2015.
 */
public class InfantAdapter extends ArrayAdapter<Infant> {
     InfantAdapter(Context context, ArrayList<Infant> users) {
        super(context, R.layout.custom_infant_listview, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row = convertView;
        // Get the data item for this position
        Infant inadapter = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (row == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            row = inflater.inflate(R.layout.custom_infant_listview, parent, false);

           // row = LayoutInflater.from(getContext()).inflate(R.layout.custom_infant, parent, false);
        }
        // Lookup view for data population
        TextView inName = (TextView) row.findViewById(R.id.NameList);
        TextView inSensor= (TextView) row.findViewById(R.id.SensorList);
        TextView inHeartRate = (TextView) row.findViewById(R.id.HeartRateList);
        TextView inRespRate = (TextView) row.findViewById(R.id.RespRateList);
        TextView inTemp = (TextView) row.findViewById(R.id.TempList);
        TextView inOxSat = (TextView) row.findViewById(R.id.OxSatList);
        /* Populate the data into the template view using the data object */
        inName.setText(inadapter.name);
        inSensor.setText(String.valueOf(inadapter.sensornum));
        inHeartRate.setText(String.valueOf(inadapter.heartrate));
        inRespRate.setText(String.valueOf(inadapter.resprate));
        inTemp.setText(String.valueOf(inadapter.temp));
        inOxSat.setText(String.valueOf(inadapter.oxsat));


        // Return the completed view to render on screen
        return row;

    }
}


