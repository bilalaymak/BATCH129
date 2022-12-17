package day13.dowhileloops;

import java.util.Scanner;

public class DoWhileLoop03 {
    public static void main(String[] args) {
/*
Gecerli Username="admin" ve Password="pwd123" dur.
Kullanicidan username ve password'u alin.
Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
Username veya password yanlis ise 3 kere "Username ve password'unuzu giriniz" mesaji versin
Username veya password 4. kere yanlis girilirse
"Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
 */
        Scanner input = new Scanner(System.in);

        int counter = 0; //programa giris sayisi

        do {
            if (counter ==4){ // giris sayisini 4 yapiyoruz: 3'den fazla giriste
                // hesabiniz bloke oldu mesaji veriyor/ yani 4.'su
                System.out.println("hesabiniz bloke olmustur");
                break; // ilk basta bloke miyiz degilmiyiz onu konrol ediyor
                //sonra bilgileri aliyor
            }
            System.out.println("Username'i giriniz");
            String username = input.next();

            System.out.println("Password'u giriniz...");
            String password = input.next();

            if (username.equals("admin") && password.equals("pwd123")){
                System.out.println("hesabiniza hos geldiniz");
                break; //dogru senaryoda break oluyor
            }
            counter++;
        }while (true); //true olmasi durumu ==> counter<=4 durumu





    }
}

