package practice;

import java.util.Arrays;
import java.util.Scanner;

public class CountsOfCharacters {
    public static void main(String[] args) {
        //take a String from user
        //type number of every character existing in the String
        // alacan ==> a = 3, l = 1, c = 1, n = 1
        // abaa   ==> a=3  b=1

        Scanner input = new Scanner(System.in);
        System.out.println("enter a String");
        String str = input.nextLine();

        //split==> to set apart every word
        String arr[] = str.split("");

        System.out.println(Arrays.toString(arr));//[b, i, l, a, l,  , a, y, m, a, k]

        //sort==> to order alphabetically
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[ , a, a, a, b, i, k, l, l, m, y]

        //make counter

        int counter = 0;

        for (int i = 1; i < arr.length; i++){
            if (arr[i-1].equals(arr[i])){
                counter++;
            }else {
                System.out.println("the number of " + arr[i-1] + " is " + (counter + 1));
                counter = 0;
            }
            if (i==arr.length-1){//at the last char to write
                System.out.println("the number of " + arr[i-1] + " is " + (counter + 1));
            }
        }












    }
}













