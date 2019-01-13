package com.stackroute.wave4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class StudentMarksTest {

    StudentMarks object;

    @Before
    public void setUp() {
         object=new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkgradessuccess() {
        String actualStr = object.checkStudentGrade(new int[]{10,12,34,56});
        String expectedStr = "valid grades";
        assertEquals(actualStr,expectedStr);
    }
    @Test
    public void checkgradesfailure() {
        String actualStr = object.checkStudentGrade(new int[]{10,120,34,56});
        String expectedStr = " Invalid input of grades";
        assertNotEquals(actualStr,expectedStr);
    }
}
