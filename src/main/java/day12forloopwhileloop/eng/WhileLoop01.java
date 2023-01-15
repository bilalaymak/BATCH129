package day12forloopwhileloop.eng;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {

        //example 1: type code to print integers from 4 to 7 on the console

        //1. way: use for-loop
        for (int i = 4;i < 8; i++){
            System.out.print(i + " ");
        }

        System.out.println();
        //2. way: use while-loop
        int i = 4;
        while (i<8){
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        //example 2:  Type code to print odd integers from 12 to 67 in the same line with a space between them


        //note: we should use one dimensional condition in the while condition!!
        //when the condition once to be false the loop will break
        int k = 12;
        while (k<68){
            if (k%2==1){
                System.out.print(k + " ");
            }
            k++;//do not forget increment part in while loop
        }




        System.out.println();
        //Example 3: Type code to find the sum of integers from 12 to 67
         int n =12;
         int sum = 0;
        while (n<68){
            sum = sum + n;
            n++;
        }
        System.out.println(sum);

        System.out.println();
        //Example 4: Type java code by using while loop,
        //           Write a program that prompts the user to input an integer.
        //           It should then find the sum of the digits of that number.
        //           123 ==> 1+2+3 = 6

        Scanner input = new Scanner(System.in);
        System.out.println("enter an integer to find the sum of the digits");
        int num = input.nextInt();
        num = Math.abs(num);
        int sumofDigits = 0;
        while (num>0){
            sumofDigits = sumofDigits + num%10;
            num = num/10;
        }
        System.out.println(sumofDigits);

       /*
     Example 5: Type java code by using while loop,
     Write a program that prompts the user to input a number.
     It should then print the multiplication table of that number.
     3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
       */
        System.out.println("enter an integer to create multiplication table");
         int nm = input.nextInt();
         int r = 1;
         while (r<11){
             System.out.println(nm + " * " + r + " = " + (nm *r));
             r++;
         }




    }
}


























