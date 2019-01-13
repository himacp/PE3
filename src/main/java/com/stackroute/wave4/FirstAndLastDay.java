package com.stackroute.wave4;

/* Hima C P
 *
 * Stack Route,Bangalore
 *
 */

//Write a java program to calculate first and last date of a week.

import java.util.Calendar;
import java.text.SimpleDateFormat;

/*Java program to calculate first and last date of a week.*/

public class FirstAndLastDay
{

    public String getDateDay()
    {
        String firstLastDay="";
        Calendar s = Calendar.getInstance();
        s.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);  //calender format is set
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy"); //pattern of the date is set
        s.add(Calendar.DATE,6); //Addition of 6 days
        firstLastDay=(sdf.format(s.getTime()));
        return firstLastDay;

    }
}

