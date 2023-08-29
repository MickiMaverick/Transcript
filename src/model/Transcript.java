package model;

import java.util.ArrayList;

public class Transcript {

    /**
     * INVARIANT: course list and grade list are the same size
     * each course has a grade associated, and vice versa, at matching indices
     */

    private final String studentName;
    private Double grade;
    private final ArrayList<String> courses;
    private final ArrayList<Double> grades;

    public Transcript(String studentName, int studentID){
        this.studentName = studentName;
        courses = new ArrayList<>();
        grades = new ArrayList<>();
    }

    //REQUIRES the grade should be between 0.0 and 4.0, and/or the course should not be null
    //MODIFIES this
    //EFFECTS assign a grade to a course in the transcript
    public void addGrade(String course, double grade) {
        if (grades.size() == 0) {
            int i = 0;
            courses.add(i, course);
            grades.add(i, grade);
        }
        else {
            int i = grades.size();
            courses.add(i, course);
            grades.add(i, grade);
        }
    }

    //REQUIRES a course the student has already taken.
    //EFFECTS returns course name and grade in format CourseName: Grade
    public String getCourseAndGrade(String course) {
        if(courses.contains(course)) {
            int index = courses.indexOf(course);
            grade = grades.get(index);
            return course + ": " + grade;
        }
        else {
            return "course not taken";
        }
    }

    //REQUIRES nothing
    //EFFECTS prints course names with grades earned
    public void printTranscript() {
        for (int i = 0; i < grades.size(); i++) {
            grade = grades.get(i);
            String course = courses.get(i);
            System.out.print(course + ": " + grade + ", ");
        }
        System.out.println();
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