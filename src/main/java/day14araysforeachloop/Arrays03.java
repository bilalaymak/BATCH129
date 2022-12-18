package day14araysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Example: String bir array olusturunuz,
        // 6 tane eleman yerlestiriniz,
        // character sayisi 5'den cok olan elemanlari siliniz

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        System.out.println(Arrays.toString(colors));//[Red, Orange, Blue, Yellow, Green, Brown]
        //orange ve yellow'un karakter sayilari 5'den buyuk, bunlari silecegiz
        // yani eleman sayisi <=5 olmasi gerekiyor

        //logic: yeni bir array olusturup, karakter sayisi 5 ve 5den kucuk olan elemanlari
        // yeni arraya transfer edecegiz, boylelikle yeni arrayimizde karakter sayisi 5den buyuk olan
        // hic bir eleman olmayacak

        //soru: hocam, array olusturmak icin iki sey belirlenmelidir
        // 1) elemanlarin data type i
        // 2) yeni arrayde kac tane eleman olacak

        //verilen array'de eleman sayisi 5 ve 5'den kucuk olan kac eleman var, bulmaliyiz

        int counter = 0; // bu bolumde arrayde karakter sayisi 6dan kucuk olan kac eleman var onu buluyoruz
        for (String w : colors){//String w : colors bizi colors Stringinde her indexi bize gezdirir
            if (w.length()<=5){
                counter++;
            }
        }
        System.out.println(counter);//4

        //arrayler collectionlara gore ilkel yapidadir, collectionlarda biz istedigimiz elemani silebiliyoruz
        //fakat arraylerde elemanlari silmemiz icin yeni array olusturmamiz gerekiyor
        // arrayler ilkel ama hizli, ilkel datalar hiz yonunden avantaj sagladigi icin kullanilir

        //yeni array olustur
        String newColors[] = new String[counter];// boylelikle biz eleman sayisi 4 olan bir array olusturduk
        //[null,null,null,null]

        //karakter sayisi 5 ve 5den kucuk olanlari yeni arraye transfer et
        int idx = 0;//yeni olusturulan indexleri bize veriyor
        for (String w : colors){//for-each-loop'da index degiskeni genel olarak "w" kullanilir
            if (w.length()<=5){
                newColors[idx] = w;//"red" i index'i 0 olan arraye koy diyoruz
                idx++;
            }

        }
        System.out.println(Arrays.toString(newColors));//[Red, Blue, Green, Brown]







    }
}













