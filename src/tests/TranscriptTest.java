package tests;

import model.Transcript;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TranscriptTest {
    private Transcript testTranscript;

    @Before
    public void setUp(){
        testTranscript = new Transcript("Michael Berger", 9999);

    }

    //Make sure a grade is actually added
    @Test
    public void testAddGrade(){
        assertEquals(null, testTranscript.getCourseAndGrade("CPSC-210"));
        testTranscript.addGrade("CPSC-210", 3.0);
        assertEquals("CPSC-210: 3.0", testTranscript.getCourseAndGrade("CPSC-210"));
    }

    //Make sure we get the correct grade for a course
    @Test
    public void testGetCourseAndGrade(){
        assertEquals(null, testTranscript.getCourseAndGrade("CPSC-210"));
        testTranscript.addGrade("CPSC-210", 3.0);
        assertEquals("CPSC-210: 3.0", testTranscript.getCourseAndGrade("CPSC-210"));
    }

    //Make sure getting the correct GPA
    @Test
    public void testGetGPA(){
        testTranscript.addGrade("CPSC-210", 3.0);
        System.out.println("Does the course "
                + "CPSC-210"
                + " has the grade "
                + testTranscript.getCourseAndGrade("CPSC-210"));
        testTranscript.addGrade("ENGL-201", 1.0);
        System.out.println("Does the course "
                + "ENGL-201"
                + " has the grade "
                + testTranscript.getCourseAndGrade("ENGL-201"));
        double GPA = testTranscript.getGPA();
        System.out.println("GPA is " + GPA);
        assertEquals(2.0, GPA, 0.1);
    }

    //Make sure getting the correct student name
    @Test
    public void testGetStudentName(){
        System.out.print("The students name is " + testTranscript.getStudentName());
        assertEquals("Michael Berger", testTranscript.getStudentName());
    }
}

