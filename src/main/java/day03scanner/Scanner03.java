package day03scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen adresinizi giriniz");
        String address = scan.nextLine();

        System.out.println(address);
    }
}
