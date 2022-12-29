package mentorship;

import java.util.Scanner;

public class Tasks01 {
    /* TASK 2:
    
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.
        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor
        !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!
        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.
        5. final notu double değerinde olmalı. (örn: 65,5)
        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.
        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve
        çıkan sonuçlar toplanmalıdır.
        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.
        eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
        80(80dahil)   ile 90 arasında ise  BA,
        70(70 dahil)   ile 80 arasında ise BB,
        60(60dahil) ile 70 arasında ise CB,
        50(50 dahil) ile 60 arasında ise CC,
        40(40 dahil) ile 50 arasında ise DC,
        30(30 dahil) ile 40 arasında ise DD,
        30 'dan düşük ise FF            gelmeli.
         */


       
    public static void main(String[] args) {
        
        /* TASK 1:
       
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */


        Scanner input =new Scanner(System.in);

        while (true){
            System.out.println("email adresinizi girin");
            String email = input.next();
             if (!email.contains("@")){
                System.out.println("gecerli bir email adresi girin");
            }
            else if (email.endsWith("gmail.com")) {
                System.out.println("email onaylandi");
                break;
            }
            else  {
                System.out.println("lutfen gmail hesabinizi girin");

            }
        }
        System.out.println("************************************");

        /* TASK 2:

        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.
        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor
        !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!
        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.
        5. final notu double değerinde olmalı. (örn: 65,5)
        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.
        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve
        çıkan sonuçlar toplanmalıdır.
        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.
        eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
        80(80dahil)   ile 90 arasında ise  BA,
        70(70 dahil)   ile 80 arasında ise BB,
        60(60dahil) ile 70 arasında ise CB,
        50(50 dahil) ile 60 arasında ise CC,
        40(40 dahil) ile 50 arasında ise DC,
        30(30 dahil) ile 40 arasında ise DD,
        30 'dan düşük ise FF            gelmeli.
         */































    }
    
    
    
    
    
    
    
}
