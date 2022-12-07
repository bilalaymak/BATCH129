package practicetechpro.methodcreation;

import java.util.Scanner;

public class MethodCreation {
    public static void main(String[] args) {

        //dikdortgenin alanı ve çevresi
        //karenin alanı
        //static ==> protokol tribünü, giriş kısıtlı

        Scanner scan = new Scanner(System.in);

        int a,b;
        System.out.println("lütfen dikdörtgenin kenarlarını yazınız");
        a = scan.nextInt();
        b = scan.nextInt();

        int alanDikdortgen = dikdortgenAlan(a,b);
        int cevreDikdortgen = dikdortgenCevre(a,b);
        System.out.println(
                "dikdörtgenin alanı = " + alanDikdortgen +
                "\ndikdörtgenin çevresi = " + cevreDikdortgen);
        kareninAlani(a);
    }

    private static int dikdortgenAlan(int a, int b){
        return  a*b;
    }

    private static int dikdortgenCevre(int a, int b){
        return 2*(a+b);

    }

    public static void kareninAlani(int a){
        System.out.println("Karenin Alanı : " +(a*a));
    }
}
