package day07ifstatements;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        //Example 1) Verilen character buyuk harf ise ekrana "Buyuk Harf" yazdiran
        // küçük harf ise ekrana küçük harf yazdıran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");

         char ch = input.next().charAt(0);

         //1. yol:

         if (ch>='A' && ch<= 'Z'){
             System.out.println("büyük harf");
         }
         if (ch>='a' && ch<='z'){
             System.out.println("küçük harf");
         }

         //2. yol:

        if (ch>='A' && ch<= 'Z'){
            System.out.println("büyük harf");
        }
         else if(ch>='a' && ch<='z') {
            System.out.println("küçük harf");
        }
         else {
            System.out.println("harf değil");
        }



    }
}
