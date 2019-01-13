package com.stackroute.wave4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class FirstAndLastDayTest {

    FirstAndLastDay dayOfWeekObject;

    @Before
    public void setUp()
    {
        dayOfWeekObject=new FirstAndLastDay();
    }

    @After
    public void tearDown()
    {
        dayOfWeekObject=null;
    }

    @Test
    public void testDayOfWeekSuccess()
    {
        String expectedlValue="07/01/2019 Mon"+"\n"+"13/01/2019 Sun";
        String actualValue=dayOfWeekObject.getDateDay();
        assertEquals(expectedlValue,actualValue);
    }

    @Test
    public void testDayOfWeekFailure()
    {
        String expectedlValue="27/01/2019 Mon"+"\n"+"13/01/2019 Sun";
        String actualValue=dayOfWeekObject.getDateDay();
        assertNotEquals(expectedlValue,actualValue);
    }

    @Test
    public void testDayOfWeekNeutral()
    {
        String expectedlValue="07/01/2019 Mon"+"\n"+"13/01/2019 Sun";
        String actualValue=dayOfWeekObject.getDateDay();
        assertNotNull(expectedlValue,actualValue);
    }

}