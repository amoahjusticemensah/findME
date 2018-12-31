package com.amjustice.findme;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.textservice.TextInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity

        implements NavigationView.OnNavigationItemSelectedListener {
    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;
    Button CourseButton;

    TextView resultTextView;

    ArrayList<String> subjects;
    ArrayList<String> subjects1;
    ArrayList<String> subjects2;
    ArrayList<String> subjects3;



    ArrayList<String>second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        spinner3 = findViewById(R.id.spinner3);
        CourseButton = findViewById(R.id.CourseButton);


        final ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Chemistry");
        subjects.add("Biology");
        subjects.add("Physics");
        subjects.add("Emaths");







        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, subjects);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, subjects);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, subjects);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);


        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                subjects1 = new ArrayList<>(subjects);
                subjects1.remove(i);
                ArrayAdapter adapter2 = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_item, subjects1);
                spinner2.setAdapter(adapter2);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                subjects2 = new ArrayList<>(subjects1);
                subjects2.remove(i);
                ArrayAdapter adapter3 = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_item, subjects2);
                spinner3.setAdapter(adapter3);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


/*
   < -- THIS SPINNER IS NOT UTILIZE-->
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                subjects3 = new ArrayList<>(subjects2);
                subjects3.remove(i);
                ArrayAdapter adapter3 = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_item, subjects3);
                spinner3.setAdapter(adapter3);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });*/





                /*
                Toast.makeText(MainActivity.this,
                        //"OnClickListener : " +
                        "\nSpinner 1 : " + String.valueOf(spinner1.getSelectedItem()) +
                                "\nSpinner 2 : " + String.valueOf(spinner2.getSelectedItem()) +
                                "\nSpinner 3 : " + String.valueOf(spinner3.getSelectedItem()) +
                                "\nfirst : " + ArrayList<?>(first),
                        Toast.LENGTH_SHORT).show();*/


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


    }




    public void Course(View view) {




        LinearLayout layout = (LinearLayout) findViewById(R.id.courseLayout);

        layout.setVisibility(View.VISIBLE);
        TextView courseList = (TextView) findViewById(R.id.courseList);

        ArrayList<String> first = new ArrayList<>();
        first.add(" ");
        first.add("Bachelor of Dental Medicine ");
        first.add("Bachelor of surgery");
        first.add("Bsc in Occupational Therapy");
        first.add("Doctor of Physiotherapy");

        if (spinner1.getSelectedItem().toString().equals("Chemistry") && spinner2.getSelectedItem().toString().equals("Biology") && spinner3.getSelectedItem().toString().equals("Physics")) {



            for (String item : first) {
                courseList.setText(courseList.getText().toString() + item + "\n");

            }


            //Toast.makeText(getApplicationContext(), "Please select the Profession", Toast.LENGTH_SHORT).show();


            //for (int i = 0; i < first.size(); i++) {

            //courseList.setText(courseList.getText() + "\n" + first.get(i) + "");

            // }


        }



        List<String> second = new ArrayList();
        second.add(" ");
        second.add("Bachelor of d ");
        second.add("Bachelor of c");
        second.add("Bsc in b");
        second.add("Doctor of a");
       if (spinner1.getSelectedItem().toString().equals("Biology") && spinner2.getSelectedItem().toString().equals("Chemistry") && spinner3.getSelectedItem().toString().equals("Physics")) {

            for (String item : second) {
                courseList.setText(courseList.getText().toString() + item + "\n");

                //Toast.makeText(getApplicationContext(), "Please select the Profession", Toast.LENGTH_SHORT).show();


                //for (int i = 0; i < first.size(); i++) {

                //courseList.setText(courseList.getText() + "\n" + first.get(i) + "");

                // }


            }
        }
    }



    public void goback(View view) {

        // = true;
        LinearLayout layout = (LinearLayout) findViewById(R.id.courseLayout);

        layout.setVisibility(View.INVISIBLE);


    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_school) {

        } else if (id == R.id.nav_update) {

        } else if (id == R.id.nav_about) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_help) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}



