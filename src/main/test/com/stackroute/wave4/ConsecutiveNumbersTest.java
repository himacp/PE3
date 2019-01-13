package com.stackroute.wave4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsecutiveNumbersTest{
ConsecutiveNumbers obj;
@Before
public void setUp()
        {
        obj = new ConsecutiveNumbers();
        }
@After
public void tearDown()
        {
        obj = null;
        }
        @Test
        public void CheckConsecutive ()
        {
        String actualinputstr = obj.CheckConsecutive("1,2,3,4,5,6,7");
        String expectedinputstr= "consecutive";
        assertEquals(actualinputstr,expectedinputstr);
        }
    @Test
    public void CheckConsecutiveFailure ()
    {
        String actualinputstr = obj.CheckConsecutive("1,2,9,4,56,6,7");
        String expectedinputstr= "non consecutive";
        assertEquals(actualinputstr,expectedinputstr);
    }
    @Test
    public void CheckConsecutiveFailure2 ()
    {
        String actualinputstr = obj.CheckConsecutive("0");
        String expectedinputstr= "non consecutive";
        assertEquals(actualinputstr,expectedinputstr);
    }
}