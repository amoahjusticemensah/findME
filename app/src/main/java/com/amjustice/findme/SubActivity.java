package com.amjustice.findme;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static com.amjustice.findme.CourseActivity.CourseButton;
import static com.amjustice.findme.CourseActivity.spinner1;
import static com.amjustice.findme.CourseActivity.spinner2;
import static com.amjustice.findme.CourseActivity.spinner3;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);


        TextView resultTextView = findViewById(R.id.resultTextView);

       // Animation animationSet = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slideoutbutton);

        /*


        final AnimationSet animationSet = new AnimationSet(getApplicationContext(), null);
        animationSet.addAnimation(new AlphaAnimation(1f, 0f));
        animationSet.addAnimation(
                new TranslateAnimation(0, resultTextView.getHeight(), 0,0));
        animationSet.setDuration(getResources().getInteger(
                android.R.integer.config_longAnimTime));


        animationSet.setAnimationListener(new Animation.AnimationListener() {


            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {


                CourseButton.setVisibility(View.GONE);
                startActivity(new Intent(getApplicationContext(), SubActivity.class));
                overridePendingTransition(
                        R.anim.activity_open_enter, R.anim.slideoutbutton);


            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        */




        // LinearLayout layout = findViewById(R.id.firstLayout);

        // LinearLayout layout1 = findViewById(R.id.secondLayout);

        // layout.setVisibility(View.VISIBLE);
        //   TextView firstView = findViewById(R.id.firstView);



        // -- added for arraylist of all chemistry Suggestions --
        ArrayList<String> chem1 = new ArrayList<>();
        chem1.add(" ");
        chem1.add("Bachelor of Medicine & Bachelor of Surgery");
        chem1.add("Bachelor of Medical Laboratory");
        chem1.add("BSc in Respiratory Therapy");
        chem1.add("BSc in Nursing");

        ArrayList<String> chem2 = new ArrayList();
        chem2.add("\n" + "");
        chem2.add("BSc in Nutrition");
        chem2.add("BSc in Chemistry");
        chem2.add("BSc in Political Science");

        ArrayList<String> chem3 = new ArrayList();
        chem3.add("\n" + "");
        chem3.add("BSc in Food Science");
        chem3.add("BSc in Animal Science");

        ArrayList<String> chem4 = new ArrayList();
        chem4.add("\n" + "");
        chem4.add("BSc in Food Process Engineering");
        chem4.add("BSc in Geophysics");

        ArrayList<String> chem5 = new ArrayList();
        chem5.add("\n" + "");
        chem5.add("BSc in Marine Science");
        chem5.add("BSc in Chemistry");
        chem5.add("BSc in Political Science");

        ArrayList<String> chem6 = new ArrayList();
        chem6.add("\n" + "");
        chem6.add("BSc in Geophysics");
        chem6.add("BSc in Psychology");


        // -- here for all Biology Suggestions--
        ArrayList<String> bio1 = new ArrayList();
        bio1.add("\n" + "");
        bio1.add("BSc in Dental Surgery");
        bio1.add("Doctor of Pharmacy");
        bio1.add("BSc in Dietetics ");
        bio1.add("BSc in Occupational Therapy");

        ArrayList<String> bio2 = new ArrayList();
        bio2.add("\n" + "");
        bio2.add("BSc in Animal Biology & Conservation Science");
        bio2.add("BSc in Biochemistry, Cell & Molecular Biology");
        bio2.add("BSc in Dietetics ");
        bio2.add("Bachelor of Law, LLB");

        ArrayList<String> bio3 = new ArrayList();
        bio3.add("\n" + "");
        bio3.add("BSc in Fisheries Science");
        bio3.add("Doctor of Veterinary Medicine");

        ArrayList<String> bio4 = new ArrayList();
        bio4.add("\n" + "");
        bio4.add("BSc in Computer Science");
        bio4.add("BSc in Plant & Environmental Biology");

        ArrayList<String> bio5 = new ArrayList();
        bio5.add("\n" + "");
        bio5.add("BSc in Biomathematics");
        bio5.add("Bsc in Nutrition");
        bio5.add("BSc in Computer Science ");

        ArrayList<String> bio6 = new ArrayList();
        bio6.add("\n" + "");
        bio6.add("BSc in Computer Science");
        bio6.add("Bsc in Physics");
        bio6.add("BSc in Geophysics ");

        //-- here for requirement of  physics
        ArrayList<String> phy1 = new ArrayList();
        phy1.add("\n" + "");
        phy1.add("BSc in Physiotherapy");
        phy1.add("Bsc in Geophysics");

        ArrayList<String> phy2 = new ArrayList();
        phy2.add("\n" + "");
        phy2.add("BSc in Geology");
        phy2.add("Bsc in Geophysics");

        ArrayList<String> phy3 = new ArrayList();
        phy3.add("\n" + "");
        phy3.add("BSc in Radiotherapy");
        phy3.add("Bsc in Applied Geology");

        ArrayList<String> phy4 = new ArrayList();
        phy4.add("\n" + "");
        phy4.add("BSc in Computer Engineering ");
        phy4.add("Bsc in Geophysics");

        ArrayList<String> phy5 = new ArrayList();
        phy5.add("\n" + "");
        phy5.add("BSc in Actuarial Science");
        phy5.add("Bsc in Mathematics");
        phy5.add("Bsc in Computer Science");

        ArrayList<String> phy6 = new ArrayList();
        phy6.add("\n" + "");
        phy6.add("BSc in Material Science & Engineering");
        phy6.add("Bsc in Actuarial Science");


        // -- added for requirements of emaths
        ArrayList<String> emaths1 = new ArrayList();
        emaths1.add("\n" + "");
        emaths1.add("BSc in Biomedical Engineering");
        emaths1.add("Bsc in Statistics");

        ArrayList<String> emaths2 = new ArrayList();
        emaths2.add("\n" + "");
        emaths2.add("BSc in Mathematics");
        emaths2.add("Bsc in Geophysics");

        ArrayList<String> emaths3 = new ArrayList();
        emaths3.add("\n" + "");
        emaths3.add("BSc in Computer Engineering");
        emaths3.add("Bsc in Biomedical Engineering");

        ArrayList<String> emaths4 = new ArrayList();
        emaths4.add("\n" + "");
        emaths4.add("BSc in Computer Engineering");
        emaths4.add("Bsc in Actuarial Science");


        ArrayList<String> emaths5 = new ArrayList();
        emaths5.add("\n" + "");
        emaths5.add("BSc in Physics");
        emaths5.add("BSc in Computer Science");

        ArrayList<String> emaths6 = new ArrayList();
        emaths6.add("\n" + "");
        emaths6.add("BSc in Statistics");
        emaths6.add("BSc in Computer Science");
        emaths6.add("BSc in Geophysics");


        // -- added below are the suggestions for chemistry---
        if (spinner1.getSelectedItem().toString().equals("Chemistry") && spinner2.getSelectedItem().toString().equals("Biology") && spinner3.getSelectedItem().toString().equals("Physics")) {
            resultTextView.setText("\n" + "Suggested Courses include:");


            for (String item : chem1) {

                //System.out.println("hello");


                 resultTextView.setText(resultTextView.getText().toString() + "\n" + item);


/*
        } else if (spinner1.getSelectedItem().toString().equals("Chemistry") && spinner2.getSelectedItem().toString().equals("Biology") && spinner3.getSelectedItem().toString().equals("Emaths")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : chem2) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);

        } else if(spinner1.getSelectedItem().toString().equals("Chemistry") && spinner2.getSelectedItem().toString().equals("Physics") && spinner3.getSelectedItem().toString().equals("Biology")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : chem3) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }
        else if(spinner1.getSelectedItem().toString().equals("Chemistry") && spinner2.getSelectedItem().toString().equals("Physics") && spinner3.getSelectedItem().toString().equals("Emaths")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : chem4) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }
        else if(spinner1.getSelectedItem().toString().equals("Chemistry") && spinner2.getSelectedItem().toString().equals("Emaths") && spinner3.getSelectedItem().toString().equals("Biology")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : chem5) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }
        else if(spinner1.getSelectedItem().toString().equals("Chemistry") && spinner2.getSelectedItem().toString().equals("Emaths") && spinner3.getSelectedItem().toString().equals("Physics")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : chem6) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }
        // --- statements for Biology
        else if(spinner1.getSelectedItem().toString().equals("Biology") && spinner2.getSelectedItem().toString().equals("Chemistry") && spinner3.getSelectedItem().toString().equals("Physics")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : bio1) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }
        else if(spinner1.getSelectedItem().toString().equals("Biology") && spinner2.getSelectedItem().toString().equals("Chemistry") && spinner3.getSelectedItem().toString().equals("Emaths")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : bio2) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }
        else if(spinner1.getSelectedItem().toString().equals("Biology") && spinner2.getSelectedItem().toString().equals("Physics") && spinner3.getSelectedItem().toString().equals("Chemistry")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : bio3) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }
        else if(spinner1.getSelectedItem().toString().equals("Biology") && spinner2.getSelectedItem().toString().equals("Physics") && spinner3.getSelectedItem().toString().equals("Emaths")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : bio4) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }
        else if(spinner1.getSelectedItem().toString().equals("Biology") && spinner2.getSelectedItem().toString().equals("Emaths") && spinner3.getSelectedItem().toString().equals("Chemistry")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : bio5) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }
        else if(spinner1.getSelectedItem().toString().equals("Biology") && spinner2.getSelectedItem().toString().equals("Emaths") && spinner3.getSelectedItem().toString().equals("Physics")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : bio6) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }

        // -- here for physics requirements
        else if(spinner1.getSelectedItem().toString().equals("Physics") && spinner2.getSelectedItem().toString().equals("Chemistry") && spinner3.getSelectedItem().toString().equals("Biology")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : phy1) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }
        else if(spinner1.getSelectedItem().toString().equals("Physics") && spinner2.getSelectedItem().toString().equals("Chemistry") && spinner3.getSelectedItem().toString().equals("Emaths")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : phy2) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }
        else if(spinner1.getSelectedItem().toString().equals("Physics") && spinner2.getSelectedItem().toString().equals("Biology") && spinner3.getSelectedItem().toString().equals("Chemistry")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : phy3) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }
        else if(spinner1.getSelectedItem().toString().equals("Physics") && spinner2.getSelectedItem().toString().equals("Biology") && spinner3.getSelectedItem().toString().equals("Emaths")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : phy4) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }
        else if(spinner1.getSelectedItem().toString().equals("Physics") && spinner2.getSelectedItem().toString().equals("Emaths") && spinner3.getSelectedItem().toString().equals("Chemistry")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : phy5) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }
        else if(spinner1.getSelectedItem().toString().equals("Physics") && spinner2.getSelectedItem().toString().equals("Emaths") && spinner3.getSelectedItem().toString().equals("Biology")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : phy6) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }

        // --added below for Emaths
        else if(spinner1.getSelectedItem().toString().equals("Emaths") && spinner2.getSelectedItem().toString().equals("Chemistry") && spinner3.getSelectedItem().toString().equals("Biology")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : emaths1) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }
        else if(spinner1.getSelectedItem().toString().equals("Emaths") && spinner2.getSelectedItem().toString().equals("Chemistry") && spinner3.getSelectedItem().toString().equals("Physics")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : emaths2) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }
        else if(spinner1.getSelectedItem().toString().equals("Emaths") && spinner2.getSelectedItem().toString().equals("Biology") && spinner3.getSelectedItem().toString().equals("Chemistry")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : emaths3) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }
        else if(spinner1.getSelectedItem().toString().equals("Emaths") && spinner2.getSelectedItem().toString().equals("Biology") && spinner3.getSelectedItem().toString().equals("Physics")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : emaths4) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }
        else if(spinner1.getSelectedItem().toString().equals("Emaths") && spinner2.getSelectedItem().toString().equals("Physics") && spinner3.getSelectedItem().toString().equals("Biology")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : emaths5) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }
        else if(spinner1.getSelectedItem().toString().equals("Emaths") && spinner2.getSelectedItem().toString().equals("Physics") && spinner3.getSelectedItem().toString().equals("Chemistry")) {

            firstView.setText("\n" + "Suggested Courses include: ");
            for (String item : emaths6) {
                firstView.setText(firstView.getText().toString() + item + "\n");

            }
            // secondView.setText(secondView.getText().toString() + item + "\n");
            layout.setVisibility(View.VISIBLE);
        }
    }

        */
            }

        }
    }
}