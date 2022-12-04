package day06stringmanipulationsifstatement;

public class StringManipulations01 {
    public static void main(String[] args) {


        //Example 1: bir String'in baş ve sonunda space karakteri varsa siliniz
        // "  Ali Can  " ==> "Ali Can" olarak düzeltme kodu

        String s = "  Ali Can   ";  //kullanıcı hatası


        System.out.println(s);

        //trim methodu rötüş yapmak(bir stringin baş ve sonundaki space karakterleri siler, aradaki spacelere dokunmaz
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        //Example 2: Aşağıda fiyatları verilen ürünlerin toplam fiyatını bulunuz
        //String tv = "$456.99";  String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$","");
        System.out.println(tv2); //456.99 ondalık sayılar java'da otomatik olarak double kabul edilir

        String laptop2 = laptop1.replace("$","");
        System.out.println(laptop2);

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2); //valueOf methodu Stringi double a çevirdi
        System.out.println("totalPrice = " + totalPrice);//1332.98

        //Example 3: verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdırınız.

        // "Ali Can"  ==> "AC" yazdıracağız
        //split method'u String i parçalamak için kullanılır "Ali Can" ==> "Ali"==> [0]index "Can" ==>[1]index

        String name = "  ali cAN  ";

        //1. aşama

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println("first = " + first); //A

        //2. aşama

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0); //[1]"CAN" kısmını alacağım demek
        System.out.println("second = " + second); //C

        System.out.println(" " + first + second ); //AC

        //iki değerin ascii değerine dönüştürüp yazdırılmaması için başa " " + koyuyoruz



        //Example 4: bir String'in hiç karakter içermediğini(boş String) kontrol eden kodu yazınız

        String str = "";

        //1. yol: length() kullan

        boolean result1 = str.length()==0;
        System.out.println("String boş mu? " + result1); // true

        //2. yol: tercih edilen yol

        boolean result2 = str.isEmpty();
        System.out.println("String boş mu? " + result2);//true

        //java bir konuda method üretmişse o methodu kullanmak en iyisidir

        //Example : bir Stringin space hariç hiç bir karakter içermediğini kontrol eden kodu yazınız

        String t = "        ";

        //1. yol:

         boolean result3 = t.replace(" ","").length()==0;
        System.out.println("sadece space mi var? " + result3); //true

        //2. yol:

        boolean result4 = t.replace(" ","").isEmpty();
        System.out.println("sadece space mi var?" + result4);//true


        //3. yol: isBlank() methodu sadece space mi var'ı kontrol eder, space dışında bir karakter içerirse false verir
        // isBlank() methodu boş Stringler için de true verir
        // isBlank() ==> space + hiçbirsey için true verir   isEmpty ==> hiçbirşey için true verir

        boolean result5 = t.isBlank();
        System.out.println("Sadece space mi var?" + result5);


        //Example 6: bir String'de a, i, e karakterlerinin ilk görünümlerinin(ilk a'yı, e'yi, i'yi istiyor yani)
        // indexleri toplamını ekrana yazdırın
        // "Java is easy to learn" ==>

        String r = "Java is easy to learn";

        int idxA = r.indexOf('a'); // 1
        System.out.println("idxA = " + idxA);//1

        int idxI = r.indexOf('i');// 5
        System.out.println("idxI = " + idxI); //5

        int idxE = r.indexOf('e');
        System.out.println("idxE = " + idxE); //8

        System.out.println("indexler toplamı = " + (idxA+idxE+idxI));

        //Example 7: bir String'de "Java" kelimesinin ilk olarak kaçıncı indexlerde kullanıldığını gösteren gösteren kodu yazınız

        // "Ah Java vah Java sensiz olmuyor Java." Yani 3. index

        String u = "Ah Java vah Java sensiz olmuyor Java.";
        //indexOf("Java") kullanımında siz "Java" kelimesinin ilk görünümündeki ilk harfin (yani J'nin) indexini almış olursunuz

        int idxJava = u.indexOf("Java");
        System.out.println(idxJava); //3
        //indexOf() method'u olmayan karakterler için kullanılırsa her zaman "-1" verir
        int idxOfXyz = u.indexOf("xyz");
        System.out.println(idxOfXyz); //-1


        //Example 8: bir String'de a,i,e karakterlerinin son görünümlerinin indexleri toplamını yazdırın

        String v = "Java is easy to learn";

        int idxOfA = v.lastIndexOf('a');
        System.out.println("idxOfA = " + idxOfA);//18

        int idxOfI = v.lastIndexOf('i');
        System.out.println("idxOfI = " + idxOfI);

        int idxOfE = v.lastIndexOf('e');
        System.out.println("idxOfE = " + idxOfE);

        System.out.println(idxOfE + idxOfI+ idxOfA);

        //Note: lastIndexOf() String olmayan bir character icin kullanilirsa her zaman "-1" verir

        //Example 9: bir String'deki tekrarsız karakterleri ekrana yazdırınız
        // abbcccdc ==> ad

        //note: bazi kodların bazı şartlara bağlı olarak çalışması gerekir.
        //bazı kodları bazı şartlara göre aktive etmek için "if statement" (yapısı) kullanılır
        //javadaki cümlelere statement diyoruz
        //if you study hard, you will learn Java.






















    }
}
