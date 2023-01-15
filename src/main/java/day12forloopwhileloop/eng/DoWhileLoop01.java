package day12forloopwhileloop.eng;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {


        //example 1: what is the difference between "while" and "Do While" loops?

        //while-loop: zero execution is possible
        int i = 1;
        while (i<1){
            System.out.println("I am while loop");
            i++;
        }

        //do-while loop: zero execution is impossible, loop body will be executed at least once
        // do-while generally is used in account, password applications
        int k = 1;
        do {
            System.out.println("I am do-while loop");
            i++;
        }while (i<1);//at the first mistake loop will be broken

        /*
      Ask user to enter an integer.
      If the integer is less than 100, tell user "Won!"
      Otherwise, tell user "Lost!"
        */

        Scanner input = new Scanner(System.in);


        do {
            System.out.println("enter an integer to play");
            int num = input.nextInt();
            if (num<100){
                System.out.println("Won!");
            }else {
                System.out.println("you lost");
                break;
            }
        }while (true);




    }
}










