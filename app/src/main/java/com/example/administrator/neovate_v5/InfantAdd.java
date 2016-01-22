package com.example.administrator.neovate_v5;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Administrator on 12/26/2015.
 */
public class InfantAdd extends Activity{
    EditText nameInput_text;
    EditText dobday_text;
    EditText dobmonth_text;
    EditText dobyear_text;
    EditText sensornumInput_text;


    public final static String NAMEFINAL = "com.example.administrator.neovate_v5.namefinal";
    public final static String DOBFINAl = "com.example.administrator.neovate_v5.namefinal";
    public final static String SENSORNUMFINAL = "com.example.administrator.neovate_v5.namefinal";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infant_add);

    }
    //listener for adding a new infant to the list
    public void newInfant(View view){
        nameInput_text=(EditText) findViewById(R.id.infantName);
        dobday_text = (EditText) findViewById(R.id.InfantAddDay);
        dobmonth_text = (EditText) findViewById(R.id.InfantAddMonth);
        dobyear_text = (EditText) findViewById(R.id.InfantAddYear);
        sensornumInput_text = (EditText) findViewById(R.id.sensorNum);
        String name = nameInput_text.getText().toString();

        String dob = (dobday_text.getText().toString()+"/" + dobmonth_text.getText().toString()+"/" + dobyear_text.getText().toString());
        String sensor = sensornumInput_text.getText().toString();

        if( (name.isEmpty())){
            showAlert(view, "Name");
        }
        else if(dob.isEmpty()){
            showAlert(view, "Date of Birth");
        }
        else if(sensor.isEmpty()){
            showAlert(view, "sensor number");
        }
        else{
            int sensornum = Integer.parseInt(sensor);
            Infant addinfant = new Infant(name, dob, sensornum,-1,-1,-1,-1);
            Intent intent2 = new Intent(this, InfantList.class);
            intent2.putExtra("infant1", addinfant);
            Log.v("ADD", "about to add");

            startActivity(intent2);
            Log.v("ADD", "back in infant add");

        }
    }
    public void showAlert(View view, String requirement)
    {
        AlertDialog.Builder missingInput = new AlertDialog.Builder(this);
        missingInput.setMessage("Missing input for " + requirement)
            .setPositiveButton("Continue", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
            }
            })
                .setTitle("Missing Field");
        missingInput.show();
        }
    }


