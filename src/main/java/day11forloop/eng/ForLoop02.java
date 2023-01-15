package day11forloop.eng;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {


        //example 1: type code to find the sum of the "unique digits" in an integer
        //           123214 ==> 3+4=7
        Scanner input = new Scanner(System.in);
        String num = input.next().replaceAll("[^0-9]","");
        int sumOfUniques = 0;

        for (int i = 0;i<num.length();i++){
            String ch = num.substring(i,i+1);//the other option is chatAt[] method
            if (num.indexOf(ch)==num.lastIndexOf(ch)){
                //indexOf(ch) is the first occurrence of ch,while lastIndexOf(ch) is
                // the last occurrence of ch
                sumOfUniques = sumOfUniques + Integer.valueOf(ch);
                //Integer.valueOf() method converts string to integers
                //if you put char data type inside the "valuOf()" method,
                //it gives us the ASCII value of the char
                // as we need to character we used substring
                //if we use "non-digit" characters in "valueOf()" method, it gives error
            }
        }
        System.out.println(sumOfUniques);








    }
}
