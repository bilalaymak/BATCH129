package day07ifstatements;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        //example 2:
        //kullanıcıdan alınan sayının tek mi çift mi olduğunu yazdıran kodu oluşturun

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int num = input.nextInt();

        //1. yol;

        if(num%2==0){
            System.out.println("çift sayı");
        }
        if (num%2!=0){
            System.out.println("tek sayı");
        }

        //2. yol; 2. yol java doğruyu okuduktan sonra diğer kodları okumaz, dolayısıyla daha hızlı olur

        if(num%2==0) {
            System.out.println("çift sayı");
        }
        else {
            System.out.println("tek sayı");
        }






























    }
}
