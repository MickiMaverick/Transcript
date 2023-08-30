package tests;

import model.Transcript;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TranscriptTest {
    private Transcript testTranscript;

    @Before
    public void setUp(){
        testTranscript = new Transcript("Michael Berger", 9999);
        testTranscript.addGrade("CPSC-210", 3.5);
        testTranscript.addGrade("ENGL-201", 4.0);

    }

    //Make sure a grade is actually added
    @Test
    public void testAddGrade(){
        assertEquals("course not taken", testTranscript.getCourseAndGrade("CPSC-110"));
        testTranscript.addGrade("CPSC-110", 3.1);
        assertEquals("CPSC-110: 3.1", testTranscript.getCourseAndGrade("CPSC-110"));
    }

    //Make sure we get the correct grade for a course
    @Test
    public void testGetCourseAndGrade(){
        assertEquals("course not taken", testTranscript.getCourseAndGrade("CPSC-110"));
        testTranscript.addGrade("CPSC-110", 3.1);
        assertEquals("CPSC-110: 3.1", testTranscript.getCourseAndGrade("CPSC-110"));
    }

    //Make sure getting the correct GPA
    @Test
    public void testGetGPA(){
        double GPA = testTranscript.getGPA();
        assertEquals(3.75, GPA, 0.1);
        testTranscript.addGrade("CPSC-110", 3.1);
        GPA = testTranscript.getGPA();
        assertEquals(3.53, GPA, 0.1);

    }

    //Make sure getting the correct student name
    @Test
    public void testGetStudentName(){
        System.out.print("The students name is " + testTranscript.getStudentName());
        assertEquals("Michael Berger", testTranscript.getStudentName());
    }
}

