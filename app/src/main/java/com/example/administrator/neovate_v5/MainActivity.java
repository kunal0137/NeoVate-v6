package com.example.administrator.neovate_v5;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.ArrayList;
//Array of options -> array adapter->ListView
//list views {views:patient.xml}


public class MainActivity extends Activity {

    ListView listView1;

    //ListView listView;
    InfantAdapter adapter;
    //ArrayAdapter<String> adapter;

    @Override
    //sets up the listview
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Infant> screenlist = InfantList.getList();
        Infant startinfant0 = new Infant("Infant 0", "01/01/01", 1, 90, -1, -1, -1);
        Infant startinfant1 = new Infant("Infant 1", "01/01/01", 1, 90, -1, -1, -1);
        Infant startinfant2 = new Infant("Infant 2", "01/01/01", 1, 90, -1, -1, -1);
        Infant startinfant3 = new Infant("Infant 3", "01/01/01", 1, 90, -1, -1, -1);
        Infant startinfant4 = new Infant("Infant 4", "01/01/01", 1, 90, -1, -1, -1);
        Infant startinfant5 = new Infant("Infant 5", "01/01/01", 1, 90, -1, -1, -1);
        Infant startinfant6 = new Infant("Infant 6", "01/01/01", 1, 90, -1, -1, -1);
        Infant startinfant7 = new Infant("Infant 7", "01/01/01", 1, 90, -1, -1, -1);
        Infant startinfant8 = new Infant("Infant 8", "01/01/01", 1, 90, -1, -1, -1);
        Infant startinfant9 = new Infant("Infant 9", "01/01/01", 1, 90, -1, -1, -1);
        Infant startinfant10 = new Infant("Infant 10", "01/01/01", 1, 90, -1, -1, -1);
        Infant startinfant11 = new Infant("Infant 11", "01/01/01", 1, 90, -1, -1, -1);
        Infant startinfant12 = new Infant("Infant 12", "01/01/01", 1, 90, -1, -1, -1);
        Infant startinfant13 = new Infant("Infant 13", "01/01/01", 1, 90, -1, -1, -1);
        Infant startinfant14 = new Infant("Infant 14", "01/01/01", 1, 90, -1, -1, -1);
        Infant startinfant15 = new Infant("Infant 15", "01/01/01", 1, 90, -1, -1, -1);

        screenlist.add(startinfant0);
        screenlist.add(startinfant1);
        screenlist.add(startinfant2);
        screenlist.add(startinfant3);
        screenlist.add(startinfant4);
        screenlist.add(startinfant5);
        screenlist.add(startinfant6);
        screenlist.add(startinfant7);
        screenlist.add(startinfant8);
        screenlist.add(startinfant9);
        screenlist.add(startinfant10);
        screenlist.add(startinfant11);
        screenlist.add(startinfant12);
        screenlist.add(startinfant13);
        screenlist.add(startinfant14);
        screenlist.add(startinfant15);


//        ArrayList<String> ar = new ArrayList<String>();
//        String s1 ="Infant A";
//        String s2 ="Infant B";
//        String s3 ="Infant C";
//        ar.add(s1);
//        ar.add(s2);
//        ar.add(s3)
        InfantAdapter adapter = new InfantAdapter(this, screenlist);

        //  listView = (ListView) findViewById(android.R.id.list);
        ListView listView1 = (ListView) findViewById(R.id.listView1);
        // View header = (View) getLayoutInflater().inflate((R.layout.header_grid_main), null);
        //  View header = (View) getLayoutInflater().inflate((R.layout.header_grid_main), null);
        //listView1.addHeaderView(header);
        listView1.setAdapter(adapter);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String rownumber = String.valueOf(position);
                        Intent infanthistory = new Intent(MainActivity.this, InfantHistory.class);
                        infanthistory.putExtra("position", position);
                        startActivity(infanthistory);

                        //Toast.makeText(MainActivity.this, rownumber, Toast.LENGTH_SHORT).show();
                    }
                }

        );




    }
//allows for interactions with different activities
    public void interact(View view) {
        String button_text;
        button_text = ((Button) view).getText().toString();
        if (button_text.equals("Add Infant")) {
            Intent intent = new Intent(this, InfantAdd.class);
            startActivity(intent);
        }
        else if (button_text.equals("Infant History")) {
            Intent intent = new Intent(this, InfantHistory.class);
            startActivity(intent);
        }
    }

}






