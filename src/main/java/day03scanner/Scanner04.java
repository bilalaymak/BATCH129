package day03scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        //kullanıcıdan iki sayı alıp 4 işlem yapan ve işlemlerin sonuçlarını ekrana yazdıran
        //kudu yazınız

        Scanner input = new Scanner(System.in);

        System.out.println("iki sayı giriniz");
        double firstNumber = input.nextDouble();

        double secondNumber = input.nextDouble();

        System.out.println("Toplamı = " + firstNumber + secondNumber);
        System.out.println("Farkı = "+  (firstNumber-secondNumber));
        System.out.println("Çarpımı = " + firstNumber * secondNumber);
        System.out.println("Bölümü = " + firstNumber / secondNumber);

    }
}
