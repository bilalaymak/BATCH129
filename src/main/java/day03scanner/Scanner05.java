package day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //kullanıcıdan bir dikdörtgenin iki kenar uzunluğunu alınız
        //alanını hesaplayınız
        //çevresini hesaplayınız

        Scanner input = new Scanner(System.in);

        System.out.println("dikdörtgenin kısa kenarı giriniz");
        float shortSide = input.nextFloat();

        System.out.println("dikdörtgenin uzun kenarı giriniz");
        float longSide = input.nextFloat();

        System.out.println("alan = " + shortSide * longSide);
        System.out.println("çevre = " + (longSide + shortSide)*2);
    }
}
