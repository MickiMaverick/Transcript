package model;

public class Transcript {

    public Transcript(String studentName, int studentID){ }

    //REQUIRES the grade should be between 0.0 and 4.0, and/or the course should not be null
    //MODIFIES this
    //EFFECTS assign a grade to a course in the transcript
    public void addGrade(String course, double grade) {
    }

    //REQUIRES nothing
    //EFFECTS returns course name and grade in format CourseName: Grade
    public String getCourseAndGrade(String course) {
        return null;
    }

    //REQUIRES nothing
    //EFFECTS prints course names with grades earned
    public void printTranscript() {
    }

    //REQUIRES nothing
    //EFFECTS return the GPA
    public double getGPA() {
        return 0.0;
    }

    //REQUIRES string
    //MODIFIES nothing
    //EFFECTS returns student name
    public String getStudentName() {return "Name";}

}