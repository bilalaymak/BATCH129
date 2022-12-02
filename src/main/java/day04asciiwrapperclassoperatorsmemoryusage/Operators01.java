package day04asciiwrapperclassoperatorsmemoryusage;

public class Operators01 {
    public static void main(String[] args) {
/*
1) +,-,*,/ işlemleri Java'da matematikte kullanıldığı gibi kullanılır.
Note1: int/int ==> int olur
Note2: double/int ==> double olur çünkü Java'da matematiksel işlemlerde farklı data type'ları kullanılırsa sonuç büyük data type'ında olur

2)Java'da "logical operator" lar vardır.
AND ve OR işlemleri "logical operator" lardır.

AND işleminden true alabilmek için her şey true olmalıdır.(& symbol)
AND işlemi "perfectionist" tir.
AND işleminde bir tane false sonucu false yapar.

OR işleminde bir tane true sonucu true yapmaya yeter.(|| or symbol)
OR işleminde sonucun false olması için her şey false olmalıdır.
OR işlemi "polyanna" gibidir.

NOT Operatörü true olanı false, false olanı true yapar. (! symbol)
!true = false
!false = true
!!true = true

3)Karşılaştırma Operatörleri(Comparison Operators)
  <, >, >=, <=, ==, !=
  Note:Karşılaştırma Operatörlerini kullandığınız kesinlikle "boolean (true/false)" alırsınız


 */


        boolean first = 3 < 5;
        boolean second = 2 + 3 != 5;
        boolean third = 2 + 3 * 5 >= 19;

        System.out.println(first + " - " + second + " - " + third);

        System.out.println(first && second);
        System.out.println(first || second);
        System.out.println(first && !second);
        System.out.println(first || second || third);

        /*
        Note: Biz AND islemi icin "&&" kullaniriz ama "&" kullanim da gecerlidir.
                Farklari nedir?
                "&&" kullanim ilk ifade "false" oldugunda digerlerini kontrol etmez dolayisiyla hizli calisir.
        "&" kullanim ilk ifade ne olursa olsun digerlerini kontrol eder dolayisiyla yavas calisir.
        Bu yuzden biz hep "&&" kullaniriz.
                */


    }
}
