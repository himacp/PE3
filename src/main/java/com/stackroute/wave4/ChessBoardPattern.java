package com.stackroute.wave4;

/* Hima C P
 *
 * Stack Route,Bangalore
*/

 /* program to create a ChessBoard pattern with the help of multidimensional array,
  where WWrepresents white color and BB represents Black color.

 */
public class ChessBoardPattern {
        public static void main(String args[]) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if ((i + j) % 2 == 0)
                        System.out.print("WW|"); //Checking for pattern of the chess(white)
                    else
                        System.out.print("BB|");//Checking for pattern of the chess(black)
                }
                System.out.println();
            }
        }
    }
