package com.stackroute.wave4;
/* Hima C P
 *
 * Stack Route,Bangalore
 *
 */

/*Write a program that will chech consecutive numbers*/


public class ConsecutiveNumbers
{
    public String CheckConsecutive(String inputstr) {
        if (inputstr != null) {
            String[] integer = inputstr.split(",");
            int a = Integer.parseInt(integer[0]);
            String match = a + "," + (a + 1) + "," + (a + 2) + "," + (a + 3) + "," + (a + 4) + "," + (a + 5) + "," + (a + 6); //matching with the input string
            if (match.equals(inputstr))
                return "consecutive";
            else
                return "non consecutive";
        }
        return null;
    }
}
