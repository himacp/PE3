package com.stackroute.wave4;

import static org.junit.Assert.*;


import com.stackroute.wave4.RemainderVowels;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
    public class  RemainderVowelsTest {
        RemainderVowels object;
        @Before
        public void setUp() throws Exception {
            object=new RemainderVowels();
        }

        @After
        public void tearDown() throws Exception {
            object=null;
        }

        @Test
        public void removeVowelsSucess() {
            String[] expectedOutput={"Ind","Untd Stts","Grmny","Egypt","czchslvk"};
            String[] actualInput={"India","United States","Germany","Egypt","czechoslovakia"};
            assertEquals(expectedOutput,object.removeVowels(actualInput));
        }

        @Test
        public void removeVowelsfailure() {
            String[] expectedOutput={"Sr Lnk","Spn","Mlys","Jpn"};
            String[] actualInput={"Sri Lanka","Spain","Malaysia","Japan"};
            assertNotEquals(expectedOutput,object.removeVowels(actualInput));
        }
    @Test
    public void removeVowelsNeutral() {
        String[] expectedOutput={"null"};
        String[] actualInput={" "};
        assertNotEquals(expectedOutput,object.removeVowels(actualInput));
    }
    }

