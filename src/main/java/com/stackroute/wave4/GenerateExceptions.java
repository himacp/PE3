package com.stackroute.wave4;

/* Hima C P
 *
 * Stack Route,Bangalore
 *
 */

/*Write a program that will generate exceptions of type NegativeArraySizeException,
IndexOutOfBoundsException,
NullPointerException.
Record the catching of each exception by displaying the message stored in the exception object.*/



public class GenerateExceptions {
  public  int number;

    public static void main(String args[]) {
        try {
            int[] myArray = new int[-8]; // NegativeArraySizeException
        } catch (NegativeArraySizeException ex) {
            System.out.println("Can't create array of negative size");
        }

        try{

        GenerateExceptions object= new GenerateExceptions();
        object=null;
        object.number=0; //NullPointerException
        }catch(NullPointerException ex){
            System.out.println("Can't create array of null pointer Exception");
        }
        try{
            int[]myArray= new int[20];
            System.out.println(myArray[21]); //IndexOutOfBoundsException
        }catch(IndexOutOfBoundsException ex){
            System.out.println("It is a outofbond Exception");
        }
    }
}
