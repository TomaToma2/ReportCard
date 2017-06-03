package com.example.android.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard studentOne = new ReportCard(5591);

        List<String> lessonsList = new ArrayList<>();

        lessonsList.add(0, "Lesson One");
        lessonsList.add(1, "Lesson Two");
        lessonsList.add(2, "Lesson Three");
        lessonsList.add(3, "Lesson Four");
        lessonsList.add(4, "Lesson Five");

        studentOne.setLessons(lessonsList);

        List<Double> gradesList = new ArrayList<>();

        gradesList.add(4.5);
        gradesList.add(4.5);
        gradesList.add(5.0);
        gradesList.add(4.5);
        gradesList.add(4.5);

        studentOne.setGrades(gradesList);

        String messageToStudent = "Have a great summer!";
        studentOne.setMessageToStudent(messageToStudent);

        Log.v("MainActivity", "studentOne: " + studentOne);

    }
}
