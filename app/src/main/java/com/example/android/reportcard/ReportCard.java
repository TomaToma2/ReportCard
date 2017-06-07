package com.example.android.reportcard;

import java.util.ArrayList;
import java.util.List;


public class ReportCard {

    // initialize students ID index
    private int mStudentId;

    // is final because it can't be modified

    private final String mSchoolName = "Wrocław Univesity of Science and Technology";
    private String mMessageToStudent;

    // List of names of subjects in report card

    private List<String> mLessons;

    //List of grade
    // List of every subject's grade in report card.
    // Grades go from 2 to 5.5 (< 3 means failed)
    // Grade system from Wroclaw University of Science and Technology in Poland

    private List<Double> mGrades;

    // constructor requires the studentId because is mandatory

    public ReportCard(int studentId) {
        this.mStudentId = studentId;
        this.mLessons = new ArrayList<>();
        this.mGrades = new ArrayList<>();
    }

    private String getSchoolName() {
        return mSchoolName;
    }

    private String getMessageToStudent() {
        return mMessageToStudent;
    }

    public void setMessageToStudent(String messageToStudent) {
        this.mMessageToStudent = messageToStudent;
    }

    private List<String> getLessons() {
        return mLessons;
    }

    public void setLessons(List<String> lessons) {
        this.mLessons = lessons;
    }

    private List<Double> getGrades() {
        return mGrades;
    }

    public void setGrades(List<Double> grades) {
        this.mGrades = grades;
    }

    public double getAverageGrade() {
        double sum = 0;

        for (int i = 0; i < mGrades.size(); i++) {
            sum += mGrades.get(i);
        }
        double mAverageGrade = sum / mGrades.size();
        return mAverageGrade;
    }

    public String getStringOfOneLessonWithGrade(int index) {
        List<String> lessons = mLessons;
        List<Double> grades = mGrades;

        String mLessonsWithGrade = lessons.get(index) + " with grade " +
                Double.toString(grades.get(index));

        return mLessonsWithGrade;
    }

    public String getStringOfAllLessonsWithGrades() {
        String mAllLessonsWithGrades = "";

        for (int i = 0; i < mLessons.size(); i++) {
            mAllLessonsWithGrades +=
                    (getStringOfOneLessonWithGrade(i) + "\n");
        }

        return mAllLessonsWithGrades;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "Student index: " + mStudentId + "\n" +
                "SchoolName: " + getSchoolName() + "\n" +
                "Lessons Evaluated: " + "\n" + getStringOfAllLessonsWithGrades() + "\n" +
                "Drawing Lessons Average Grade: " + getAverageGrade() + "\n" +
                "Message To Student: " + getMessageToStudent() + "\n" +
                '}';
    }

}










