package com.stackroute.wave4;

/* Hima C P
 *
 * Stack Route,Bangalore
 *
 */

/*program to compute the addition of two matrix*/


import java.util.Arrays;


public class MatrixAddition {
    public String addition(int[][] firstMatrix,int[][] secondMatrix,int row,int column)
    {
        int[][] finalMatrix=new int[row][column];
        for(int i=0;i<row;i++)
            for (int j = 0; j < column; j++)
                finalMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];  //addition of matrix
        String object= Arrays.deepToString(finalMatrix); //Conversion of string to 2 dimensional array
        return object;
    }
}

