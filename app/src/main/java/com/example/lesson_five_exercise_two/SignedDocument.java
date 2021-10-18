package com.example.lesson_five_exercise_two;

import android.util.Log;

public class SignedDocument extends Document{
    Worker worker = new Worker();

    public SignedDocument(String title, String text, String firstname, String secondname) {
        super(title, text);
        this.worker.firstname = firstname;
        this.worker.secondname = secondname;

    }

    @Override
    public void print(){
        super.print();
       Log.d("myLog",worker.createSignature(worker.firstname, worker.secondname));
    }
}
