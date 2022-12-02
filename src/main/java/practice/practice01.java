package practice;

import java.util.Scanner;

public class practice01 {

    /*gömlek ve ayakkabı fiyatları için iki tane variable oluşturup toplam fiyatı ekrana
        yazdırın
        */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int gomlekAdedi;
        double gomlekFiyati = 350;
        int ayakkabiAdedi;
        double ayakkabiFiyati = 1000;

        System.out.println("almak istedğiniz gömlek adedini giriniz");
        gomlekAdedi = scan.nextInt();

        System.out.println("almak istediğiniz ayakkabı adedini giriniz");
        ayakkabiAdedi =  scan.nextInt();

        double toplamUcret = alisverisIslemi();
        System.out.println("toplamUcret = " + toplamUcret);


    }

    private static int alisverisIslemi(int gomlekAdedi, int ayakkabiAdedi,double gomlekFiyati,double ayakkabiFiyati) {
        return gomlekAdedi * gomlekFiyati + ayakkabiAdedi * ayakkabiFiyati;
    }




}
