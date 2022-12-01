package day03scanner;

import java.io.IOException;
import java.util.Scanner;

public class Scanner02 {
    //kullanıcıdan ilk isimini ve soy ismini alıp ikisini aynı satırda ekrana yazdırınız

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi yazınız");
        String firstName = scan.next();

        System.out.println("Lütfen soyisminizi giriniz");
        String lastName = scan.next();

        System.out.println(firstName + " " + lastName);





    }

}
