package com.stackroute.wave4;

/* Hima C P
 *
 * Stack Route,Bangalore
 *
 * Boeing India Pvt Ltd.
 */

/*Write a program to set up an array of places, Loop round and remove the vowels. Display the new words in console*/

public class RemainderVowels {
    public String[] removeVowels(String[] input) {
        if (input != null) {
            for (int i = 0; i < input.length; i++)         //checking for vowels
            {
                if (input[i].contains("a")) {
                    input[i] = input[i].replace("a", "");
                }

                if (input[i].contains("e")) {
                    input[i] = input[i].replace("e", "");
                }

                if (input[i].contains("i")) {
                    input[i] = input[i].replace("i", "");
                }

                if (input[i].contains("o")) {
                    input[i] = input[i].replace("o", "");
                }

                if (input[i].contains("u")) {
                    input[i] = input[i].replace("u", "");
                }
            }
            return input;
        }
        return null;
    }
}
