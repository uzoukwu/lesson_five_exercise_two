package com.example.lesson_five_exercise_two;

import android.annotation.SuppressLint;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Document {

    public String title;
    public String text;
    Worker worker = new Worker();


    public Document(String title, String text) {
        this.title = title;
        this.text = text;

    }

    public void print(){
        Log.d("myLog", title);
        Log.d("myLog", text);

    }

    public void saveDocuments(String folderpath) {
        Log.d("myLog", "Document saved to folder: " + folderpath + "/" + title);
    }
}
