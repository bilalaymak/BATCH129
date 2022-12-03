package day05TypeCastingstringmanipulation;

public class StringManipulations01 {

    //String bir nonprimitive data type'ı olmakla birlikte aynı zamanda bir class'tır.
    public static void main(String[] args) {


        String s = "Java is easy";

        //Example 1: "s" Stringindeki bütün karakterleri büyük yapın

        String sUpper = s.toUpperCase();
        System.out.println(sUpper);

        //Example 2: "s" Stringindeki bütün karakterleri küçük yapın

        String sLower = s.toLowerCase();

        //Example 3: "s" Stringindeki ilk karakteri alınız

        //" Java is ea s  y "
        //  0123456789 10 11

        char firstChar = s.charAt(0);
        System.out.println(firstChar);

        //Example 4: "s" Stringindeki ikinci ve sondan ikinci karakteri alınız ve ekrana yan yana yazdırınız

        char secondChar = s.charAt(1);
        char secondLastChar = s.charAt(10);
        System.out.println(secondChar + secondLastChar);//212 charları sayısal olarak toplar

        //1. yanyana yazdır
        System.out.println(secondChar);
        System.out.println(secondLastChar);

        //2. yanyana yazdır

        System.out.println("" + secondChar + secondLastChar);
        //böyle yapınca java concatenation olarak
        //düşünür ve yanyana yazdırır
        //başa ve sona "yazdırılamaz"


        //Example 5; s Stringinde kullanılan karakter sayısını bulunuz

        int sLenght = s.length();
        System.out.println(sLenght);//12

        //index numarasi 0 dan ,  karakter sayisi 1 den başlar

        //Example 6: s Stringinndeki ilk dört karakteri alınız
        //substring[0, 4)
        String sub1 = s.substring(0, 4); //ilk index başlangıç noktası, ikinci index bir sonraki sayı olacak
        System.out.println(sub1);

        //Example 7: s Stringinndeki "is"  kelimesini alınız

        String subIs = s.substring(5, 7);
        System.out.println(subIs);

        //Example 8: s Stringinndeki "easy"  kelimesini alınız

        String subEasy = s.substring(8, 12);
        System.out.println(subEasy);

        String subEasy2 = s.substring(8);
        System.out.println(subEasy2);
        // biryerden başlayıp sona gitmesini istiyorsak 2. indexi yazmıyoruz (8,12) yerine (8)


        //Example 9: s Stringindeki "money"  kelimesinin var olup olmadığını kontrol ediniz

        boolean isExistMoney = s.contains("money");
        System.out.println(isExistMoney);//false

        boolean isExisteasy= s.contains("easy");//true
        System.out.println(isExisteasy);

        boolean isExistEasy = s.contains("Easy"); //false verir, küçük büyük harfe duyarlıdır
        System.out.println(isExistEasy);

        boolean isExist = s.contains(" ");
        System.out.println(isExist);


        /*
        bir method'u öğrenirken 3 şeyi mutlaka öğrenin
        i; bu method ne iş yapar?
        ii; bu method'un farklı kullanımları nasıldır?
        iii; bu method bize ne return eder? sonuç verir int boolean, char...

         */

        //Example 10: s Stringinin belli bir harfle başlayıp başlamadığını kontrol ediniz
        // mesela IBAN noları kontrol etmek

        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);//true

        boolean isStart01 = s.startsWith("J");
        System.out.println(isStart01);//true

        boolean isStart02 = s.startsWith("");
        System.out.println(isStart02);//true

        /*
        Example 11: s Stringinin 6. karakterden itibaren
         belli bir harfle başlayıp başlamadığını kontrol ediniz

        */

        boolean isStart03 = s.startsWith("i", 5);
        // toffset- çöpe atılan karakter sayısı, i'den önceki karakterler

        //" Java is ea s  y "
        //  0123456789 10 11

        System.out.println(isStart03);















    }
}
