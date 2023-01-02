package practice;

import java.util.Scanner;

public class FrequencyOfCertainChar {
    public static void main(String[] args) {

        //take user a word(String) and character
        // then control how many times the char repeated
        //               char ch= 'e' ;
        //               String name ="Sevecen"
        //               => Number of repeating = 3

        Scanner input = new Scanner(System.in);
        System.out.print("enter a word : ");
        String word = input.next();
        System.out.print("enter a character : ");
        char character = input.next().charAt(0);//takes a single character

        int counter = 0;
        for(int i = 0; i < word.length(); i++){
            if (word.charAt(i) == character){
                counter ++;
            }
        }
        System.out.println("number of repetition : "  + counter);






    }
}














