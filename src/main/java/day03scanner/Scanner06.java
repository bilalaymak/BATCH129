package day03scanner;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli
        // bir sayinin ilk iki ve son iki basamagindaki
        //  rakamlari toplamini yazdiran kodu yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı bir sayı giriniz");

        int number = scan.nextInt();
        int ilkIkiRakam = number/1000;
        System.out.println("ilkIkiRakam = " + ilkIkiRakam);

        int ilkIkiTop = (ilkIkiRakam % 10) + (ilkIkiRakam/10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);

        int sonIkiRakam = number % 100;
        System.out.println("sonIkiRakam = " + sonIkiRakam);

        int sonIkiRakamTop = (sonIkiRakam % 10) + (sonIkiRakam/10);
        System.out.println("sonIkiRakamTop = " + sonIkiRakamTop);

        int toplam = ilkIkiTop + sonIkiRakamTop;
        System.out.println("toplam = " + toplam);

    }
}
