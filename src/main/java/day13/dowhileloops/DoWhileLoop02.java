package day13.dowhileloops;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {

        /*
   Kullanicidan bir tam sayi aliniz
   Tam sayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
   Tam sayi 100 ve 100'den büyük ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz.
        */

        Scanner input = new Scanner(System.in);

        int num = 0; // burayi do'nun disina cektik


        do {
            System.out.println("bir sayi giriniz");
            num = input.nextInt();
            //kullanici surekli deger versin diye input almayi
            //loop'un icine aldik
            //int num'u disari cektigimiz icin int variable'ini sildik
            if (num>=100){
                System.out.println("kazandiniz");
            }
        }while (num>=100); //boylece hem kazandiniz yazdiracak hem de donguyu devam ettirecek

        System.out.println("kaybettiniz");

        /*
        scope== curly braces icinde kullanilan degerler body'nin disinda kullanilinca hata verir
        (kirmizi renk olur)
        dolayisiyla do'nun body'sinddeki num bodynin disinkdaki while disinda hata verir
        sonuc olarak int num = 0; variable'ini looplarin disinda kullanmamiz lazim
         */

    }
}
