package day03scanner;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli
        // bir sayinin ilk iki ve son iki basamagindaki
        //  rakamlari toplamini yazdiran kodu yaziniz
// javada tam sayıyı tam sayıya böldüğümüzde virgülden sonrasını hesaba katmaz..
// dolayısıyla almak istediğimiz rakamları bu bölme işlemlerini yaparak hallederiz
// java yuvarlama yapmaz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı bir sayı giriniz");

        int number = scan.nextInt();

        //son rakam al
        int lastDigit = number % 10;
        System.out.println(lastDigit);

        //sayıyı küçült
        number = number/10;
        System.out.println(lastDigit);

    }
}
