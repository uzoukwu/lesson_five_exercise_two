package com.example.lesson_five_exercise_two;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       SignedDocument mysigned = new SignedDocument("Signed tittle", "Signed text",
               "Lucy","Smith");
       mysigned.print();

       DocumentDatedandSigned sign = new DocumentDatedandSigned("Dated Title","Dated text",
                "2021.03.06","Lara", "Croft");
        sign.print();













    }
}