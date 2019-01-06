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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity

        implements NavigationView.OnNavigationItemSelectedListener {
    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;
    Button CourseButton;

    TextView firstView;
    TextView secondView;


    ArrayList<String> subjects;
    ArrayList<String> subjects1;
    ArrayList<String> subjects2;
    ArrayList<String> subjects3;


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


        LinearLayout layout = findViewById(R.id.firstLayout);
        LinearLayout layout1 = findViewById(R.id.secondLayout);

        // layout.setVisibility(View.VISIBLE);
        TextView firstView = findViewById(R.id.firstView);


        // -- added for arraylist of all chemistry Suggestions --
        ArrayList<String> chem1 = new ArrayList<>();
        chem1.add(" ");
        chem1.add("Bachelor of Medicine & Bachelor of Surgery");
        chem1.add("Bachelor of Medical Laboratory");
        chem1.add("BSc in Respiratory Therapy");
        chem1.add("BSc in Nursing");

        ArrayList<String> chem2 = new ArrayList();
        chem2.add("\n"+ "");
        chem2.add("BSc in Nutrition");
        chem2.add("BSc in Chemistry");
        chem2.add("BSc in Political Science");

        ArrayList<String> chem3 = new ArrayList();
        chem3.add("\n"+ "");
        chem3.add("BSc in Food Science");
        chem3.add("BSc in Animal Science");

        ArrayList<String> chem4 = new ArrayList();
        chem4.add("\n"+ "");
        chem4.add("BSc in Food Process Engineering");
        chem4.add("BSc in Geophysics");

        ArrayList<String> chem5 = new ArrayList();
        chem5.add("\n"+ "");
        chem5.add("BSc in Marinie Science");
        chem5.add("BSc in Chemistry");
        chem5.add("BSc in Political Science");

        ArrayList<String> chem6 = new ArrayList();
        chem6.add("\n"+ "");
        chem6.add("BSc in Geophysics");
        chem6.add("BSc in Psychology");



        // -- here for all Biology Suggestions--
        ArrayList<String> bio1 = new ArrayList();
        bio1.add("\n"+ "");
        bio1.add("BSc in Dental Surgery");
        bio1.add("Doctor of Pharmacy");
        bio1.add("BSc in Dietetics ");
        bio1.add("BSc in Occupational Therapy");

        ArrayList<String> bio2 = new ArrayList();
        bio2.add("\n"+ "");
        bio2.add("BSc in Animal Biology & Conservation Science");
        bio2.add("BSc in Biochemistry, Cell & Molecular Biology");
        bio2.add("BSc in Dietetics ");
        bio2.add("Bachelor of Law, LLB");

        ArrayList<String> bio3 = new ArrayList();
        bio3.add("\n"+ "");
        bio3.add("BSc in Fisheries Science");
        bio3.add("Doctor of Veterinary Medicine");

        ArrayList<String> bio4 = new ArrayList();
        bio4.add("\n"+ "");
        bio4.add("BSc in Computer Science");
        bio4.add("BSc in Plant & Environmental Biology");

        ArrayList<String> bio5 = new ArrayList();
        bio5.add("\n"+ "");
        bio5.add("BSc in Biomathematics");
        bio5.add("Bsc in Nutrition");
        bio5.add("BSc in Computer Science ");

        ArrayList<String> bio6 = new ArrayList();
        bio6.add("\n"+ "");
        bio6.add("BSc in Computer Science");
        bio6.add("Bsc in Physics");
        bio6.add("BSc in Geophysics ");

        //-- here for requirement of  physics and emaths--
        //content will go here...





        // -- added below are the suggestions for chemistry---
        if (spinner1.getSelectedItem().toString().equals("Chemistry") && spinner2.getSelectedItem().toString().equals("Biology") && spinner3.getSelectedItem().toString().equals("Physics")) {
            firstView.setText("\n"+"Suggested Courses include:");


            for (String item : chem1) {

                firstView.setText(firstView.getText().toString() +  "\n"+ item);
            }
            layout.setVisibility(View.VISIBLE);

        } else if (spinner1.getSelectedItem().toString().equals("Chemistry") && spinner2.getSelectedItem().toString().equals("Biology") && spinner3.getSelectedItem().toString().equals("Emaths")) {

            firstView.setText("\n"+"Suggested Courses include: ");
            for (String item : chem2) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);

        }
    }


    public void goback(View view) {

        // = true;
        LinearLayout layout = (LinearLayout) findViewById(R.id.firstLayout);

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