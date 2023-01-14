package day12forloopwhileloop.eng;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {


        /*
            2.Example:Type code to get the output like
                Week: 1
                  Day: 1
                  Day: 2
                  Day: 3
                  .....
                Week: 2
                  Day: 1
                  Day: 2
                  Day: 3
                  ....
                Week: 3
                  Day: 1
                  Day: 2
                  Day: 3
                  ....


            nested loops are "time-consuming", that is why if it is not mandatory,
            do not prefer to use "nested loops"
            if a code is "time-consuming" it means it has "time complexity"
            there is a way to calculate the value of "time-complexity":
            if you have two loops, the time complexity is the square of 2 ==> 4
            if you have three loops, the time complexity is the cube of 3 ==> 27
 */
           for (int i=1;i<5;i++){
               System.out.println("Week:" + i);
               for (int k=1; k<8; k++){
                   System.out.println("Day: " + k);
                   for (int m = 1; m<5;m++){
                       System.out.println("    hi!");
                   }
               }
           }


           /*
     Example 3: Write a Java Program to Print Rectangle Star Pattern using For Loop
                 ****
                 ****
                 ****
     Note: Get the number of rows and columns from user
          */

        Scanner input = new Scanner(System.in);
        System.out.println("enter the numbers of rows");
        int rows = input.nextInt();
        System.out.println("enter the numbers of columns");
        int colums = input.nextInt();

            for (int k=1;k<=rows;k++){

                for (int l=1;l<=colums;l++){
                    System.out.print("*");
                }
                System.out.println();
            }




    }
}












