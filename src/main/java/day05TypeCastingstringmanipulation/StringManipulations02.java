package day05TypeCastingstringmanipulation;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Example 1: "s Stringinin "money" ile bitip bitmediğini kontrol ediniz"

        boolean isEndMoney = s.endsWith("money");
        System.out.println(isEndMoney);

        boolean isEndNothing = s.endsWith("");
        System.out.println(isEndNothing);

        //Example 1: "s" String'inin "money" ile bitip bitmediğini kontrol ediniz
        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //Example 2: "s" String'indeki "money" kelimesini "dollar" kelimesine çeviriniz
        String s1 = s.replace("money","dollar");
        System.out.println(s1);

        //Example 3: "s" String'indeki "earn" kelimesini "win" kelimesine çeviriniz
        String s2 = s.replace("earn","win");
        System.out.println(s2);//Lwin Java win money

        //Example 4: "s" String'indeki "a" harflerini "*" a çeviriniz

        //replace methodunda çoklu karakter ile çalışırsanız mecburen çift tırnak kullanacaksınız
        //ama tek karakterle çalışırsanız çift tırnak veya tek tırnak kullanabilirsiniz


        String s3 = s.replace("a","*");
        System.out.println(s3);//Le*rn J*v* e*rn money

        //ama ya ikiside çift tırnak olmalıdır ya da ikisi de tek tırnak olmalıdır

        //Example 5: s Stringindeki "n" harflerini "XXX" a çevirin

        String s4 = s.replace("n","XXX");
        System.out.println(s4);

        //Example 6: s Stringindeki bütün "e" harflerini siliniz
        //"hiçbirşey" char data type'ında yoktur dolayısıyla replace için "" çift tırnak kullanınız

        String s5 = s.replace("e","");
        System.out.println(s5);


        String t = "Ali 13 yasindadir!...";

        //Example 7: t Stringindeki tüm rakamları(0dan 9a kadar) "*" a çeviriniz
        // bir grup datayı değiştirmek için rePlaceAll() kullanılır

        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);

        /*
         Meşhur Regex'ler
         1) tüm rakamları kastediyorsak ==> [0-9]
         2) tüm küçük harfler ==> [a-z]
         3) tüm büyük harfler ==> [A-Z]
         4) tüm harfler ==> [a-zA-Z]
         5) tüm harfler ve rakamlar ==>[a-zA-Z0-9]
         6) tüm noktlama işaretleri ==> \\p{Punct}
         7) tüm sesli harfler ==> [AEIOUaeiou]
           eğer x, q, w harflerini kastediyorsak ==> [xqw]

         8) küçük harflerden faklı tüm karakterler ==> [^a-z]
          9) Space dışındaki tüm karakterler ==> \\

         */


        //Example 8: t Stringindeki tüm rakamları(0dan 9a kadar) ve harfleri "!" e çeviriniz

        String t2 = t.replaceAll("[0-9]", "!");
        System.out.println(t2);

        String t3 = t.replaceAll("[a-zA-Z0-9]","?");
        System.out.println(t3);

        String t4 = t.replaceAll("[a-zA-Z]","?");
        System.out.println(t4);

        String t5 = t.replaceAll("[AEIOUaeiou]","?");
        System.out.println(t5);

        //Example 9: t Stringindeki küçük harfler dışındaki tüm karakterleri "<>"e çevirin

        String t6 = t.replaceAll("[^a-z]","<>");
        System.out.println(t6);

        //Example 10: t Stringindeki tüm harfler dışındaki tüm karakterleri "+"e çevirin

        String t7 = t.replaceAll("[a-zA-Z]","+");
        System.out.println(t7);

        //Example 11: t Stringindeki space'ler dışındaki tüm karakterleri "$"e çevirin

        String t8 = t.replaceAll("[^ ]","+");
        System.out.println(t8);

        //Example 12: t Stringindeki sesli harfler dışındaki tüm karakterleri "&"e çevirin

        String t9 = t.replaceAll("[^AEIOUaeiou]","&");
        System.out.println(t9);






















    }
}
