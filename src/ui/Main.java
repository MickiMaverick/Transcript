package ui;

import model.Transcript;

public class Main {
    public static void main(String[] args) {
        System.out.println(" ... create the transcripts ...");
        Transcript t1 = new Transcript("Jane Doe", 7830);
        Transcript t2 = new Transcript("Ada Lovelace", 8853);
        Transcript t3 = new Transcript("Michael Berger", 9999);

        System.out.println(" ... add grades to courses ...");
        t1.addGrade("CPSC-210", 3.5);
        t1.addGrade("ENGL-201", 4.0);
        t1.addGrade("CPSC-110", 3.1);
        t2.addGrade("CPSC-210", 1.0);
        t2.addGrade("ENGL-201", 1.0);
        t2.addGrade("CPCS-110", 1.0);
        t3.addGrade("CPSC-210", 4.0);
        t3.addGrade("ENGL-201", 4.0);
        t3.addGrade("CPSC-110", 4.0);

        System.out.println(" ... print transcript ...");
        System.out.print(t1.getStudentName() + ": ");
        t1.printTranscript();

        System.out.println(" ... print GPA ...");
        System.out.println("GPA: " + t1.getGPA());

        System.out.println(" ... print CourseAndGrade ...");
        System.out.println(t1.getCourseAndGrade("ENGL-201"));

    }
}