package com.example.android.reportcard;

import java.util.ArrayList;
import java.util.List;


public class ReportCard {

    // initialize students ID index
    private int studentId;

    // is final because it can't be modified

    private final String schoolName = "Wrocław Univesity of Science and Technology";
    private String MessageToStudent;

    // List of names of subjects in report card

    private List<String> lessons;

    //List of grade
    // List of every subject's grade in report card.
    // Grades go from 2 to 5.5 (< 3 means failed)
    // Grade system from Wrocław University of Science and Technology in Poland

    private List<Double> grades;

    // constructor requires the studentId because is mandatory

    public ReportCard(int studentId) {
        this.studentId = studentId;
        this.lessons = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    private String getSchoolName() {
        return schoolName;
    }

    private String getMessageToStudent() {
        return MessageToStudent;
    }

    public void setMessageToStudent(String messageToStudent) {
        this.MessageToStudent = messageToStudent;
    }

    private List<String> getLessons() {
        return lessons;
    }

    public void setLessons(List<String> lessons) {
        this.lessons = lessons;
    }

    private List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public int getStudentId() {
        return studentId;
    }

    private double getAverageGrade() {
        double sum = 0;

        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        double averageGrade = sum / grades.size();
        return averageGrade;
    }

    private String getStringOfOneLessonWithGrade(int index) {
        List<String> lessons = getLessons();
        List<Double> grades = getGrades();

        String lessonWithGrade = lessons.get(index) + " with grade " +
                Double.toString(grades.get(index));

        return lessonWithGrade;
    }

    private String getStringOfAllLessonsWithGrades() {
        String allLessonsWithGrades = "";

        for (int i = 0; i < lessons.size(); i++) {
            allLessonsWithGrades +=
                    (getStringOfOneLessonWithGrade(i) + "\n");
        }

        return allLessonsWithGrades;
    }

    @Override
    public String toString() {
        String filledReportCard = "Student ID: " + Integer.toString(studentId) + "\n" +
                "School: " + getSchoolName() + "\n" +
                "Lessons evaluated:\n" +
                getStringOfAllLessonsWithGrades() +
                "Average grade: " + getAverageGrade() + "\n" +
                "Message from the teacher: " + getMessageToStudent();
        return filledReportCard;
    }


}










