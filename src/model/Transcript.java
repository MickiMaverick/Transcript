package model;

import java.util.ArrayList;
import java.util.List;

public class Transcript {

    /**
     * INVARIANT: course list and grade list are the same size
     * each course has a grade associated, and vice versa, at matching indices
     */

    private String studentName;
    private Integer studentID;
    private String course;
    private Double grade;
    private ArrayList<String> courses;
    private ArrayList<Double> grades;

    public Transcript(String studentName, int studentID){
        this.studentName = studentName;
        this.studentID = studentID;
        this.course = course;
        this.grade = grade;
        courses = new ArrayList<>();
        grades = new ArrayList();
    }

    //REQUIRES the grade should be between 0.0 and 4.0, and/or the course should not be null
    //MODIFIES this
    //EFFECTS assign a grade to a course in the transcript
    public void addGrade(String course, double grade) {
        if (grades.size() == 0) {
            Integer i = 0;
            courses.add(i, course);
            grades.add(i, grade);
        }
        else {
            Integer i = grades.size();
            courses.add(i, course);
            grades.add(i, grade);
        }
    }

    //REQUIRES a course the student has already taken.
    //EFFECTS returns course name and grade in format CourseName: Grade
    public String getCourseAndGrade(String course) {
        courses.contains(course);
        int index = courses.indexOf(course);
        grade = grades.get(index);
        return course + ": " + grade;
    }
  //  {
    //    Integer index = courses.indexOf(course);
      //  Double i = grades.get(index);
       // return course + ": " + String.valueOf(i);
    //}

    //REQUIRES nothing
    //EFFECTS prints course names with grades earned
    public void printTranscript() {
        for (int i = 0; i < grades.size(); i++) {
            int index = i;
            grade = grades.get(index);
            course = courses.get(index);
            System.out.print(course + ": " + grade + ", ");
        }
    }

    //REQUIRES nothing
    //EFFECTS return the GPA
    public double getGPA() {
        double gpa = grades.stream().mapToDouble(f -> f).sum();
        return gpa / grades.size();
    }

    //REQUIRES string
    //MODIFIES nothing
    //EFFECTS returns student name
    public String getStudentName() {return studentName;}

}