package com.amjustice.findme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

import at.markushi.ui.CircleButton;


public class CourseActivity extends AppCompatActivity  {

    static Spinner spinner1;
    static Spinner spinner2;
    static Spinner spinner3;
    static CircleButton CourseButton;



    static ArrayList<String> subjects;
    static ArrayList<String> subjects1;
    static ArrayList<String> subjects2;
    static ArrayList<String> subjects3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        spinner3 = findViewById(R.id.spinner3);
        CourseButton =  findViewById (R.id.CourseButton);

        final ArrayList<String> subjects = new ArrayList<>();
        subjects.add("Chemistry");
        subjects.add("Biology");
        subjects.add("Physics");
        subjects.add("Emaths");


        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(CourseActivity.this, android.R.layout.simple_spinner_item, subjects);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(CourseActivity.this, android.R.layout.simple_spinner_item, subjects);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(CourseActivity.this, android.R.layout.simple_spinner_item, subjects);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);


        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                subjects1 = new ArrayList<>(subjects);
                subjects1.remove(i);
                ArrayAdapter adapter2 = new ArrayAdapter(CourseActivity.this, android.R.layout.simple_spinner_item, subjects1);
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
                ArrayAdapter adapter3 = new ArrayAdapter(CourseActivity.this, android.R.layout.simple_spinner_item, subjects2);
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





    }

    public void Course(View view) {
        Intent intent = new Intent(getApplicationContext(), SubActivity.class);
        //intent.putExtra("placeNumber", i);

        startActivity(intent);
    }
}
