package day05TypeCastingstringmanipulation;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

        /*
        Example 1: aşağıdaki kurallara göre kullanıcının girdiği password'u konrol edin
        1) en az 8 karakter olsun
        2) space olmasın
        3) en az 1 tane büyük harf olsun
        4) en az bir tane küçük harf olsun
        5) en az 1 tane sembol olsun
        6) en az 1 tane rakam olsun

         */

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Password'ünüzü giriniz");

        String password = input.nextLine();

        //1) en az 8 karakter olsun

        boolean first = password.length()>7;
        System.out.println(first);

        //2) space olmasın (içermesin'i komutunu "!" ile yapıyoruz)

        boolean second = !password.contains(" ");
        System.out.println(second);

        //3) en az 1 tane büyük harf olsun
        // büyük olmayanları sil
        // kalan karakter sayısına bak
        // karakter sayısı 0 ise büyük harf yok demektir
        // sıfırdan büyük ise büyük harf var demektir

        boolean third = password.replace("[^A-Z]","").length()>0;
        System.out.println(third);

        // iki veya daha fazla method'u yine nokta "." ile birleştiriyoruz ==> method chain


        //4) en az bir tane küçük harf olsun

        boolean fourth = password.replaceAll("[^a-z]"," ").length()>0;
        System.out.println(fourth);

        //5) en az 1 tane sembol(harf ve rakam harici herşey) olsun

        boolean fifth = password.replaceAll("[^a-zA-Z0-9]","").length()>0;
        System.out.println(fifth);

        //6) en az 1 tane rakam olsun

        boolean sixth = password.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixth);

        System.out.println("Pasword geçerli mi = " + (first && second && third && fourth && fifth && sixth));















    }
}
