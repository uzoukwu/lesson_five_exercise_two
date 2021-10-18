package com.example.lesson_five_exercise_two;

import android.util.Log;

public class Worker extends Human{
    public String firstname;
    public String secondname;

    public Worker(){
    Human human = new Human();
    firstname = human.getName();
    secondname = human.getLastname();
    }
   public String createSignature(String firstname, String secondname){
       return firstname + " " + secondname;

    }
}
