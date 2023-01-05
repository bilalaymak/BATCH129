package day20passbyvaluemethodoverloading;

public class MethodOverLoading01 {

    /*
    1) method overloading yaparken method ismi degistirilmez
    2) method overloading yaparken parametreler degistirilir
       i)parameter degistirirken ,parametrelerin data typelari degistirilebilir
       ii)parametre degistirilirken, parametrelerin data "typelari farkli ise" yerleri degistirilebilir
       iii)parametre degistirilirken, parametrelerin sayisi degistirilebilir
    3) access modifier ve return type degisimi overloadingi gedistirmez(public static void kismi)
       java icin ismi ve parametreleri ayni olan iki method tamamiyla aynidir
       add(int a, int b) ==> bu kisim "method signature" olarak adlandirilir
    4) method overloading olusturulurken return type'i degistirmenin hicbir etkisi yoktur
       method overloading olusturulurken access modifier'i degistirmenin hicbir etkisi yoktur
       method overloading olusturulurken  methodu static ya da non-static yapmanin hicbir etkisi yoktur
       method overloading olusturulurken method body'i degistirmenin hicbir etkisi yoktur
    5) private methods can be overload. cunku method overloading sadece bir classin icinde olur
       private olmak ise baska classlara gidildiginde problem olur
       (overriding konusunda onemli, private overriding edilemiyor)
    6) static methodlarover overload edilebilir

     */


    public static void main(String[] args) {

         add(3,5);

    }

    public static void add(int a, int b){
        System.out.println(a+b);
    }
    private static void add(double a, double b){// 2 tane autowidenining var
        System.out.println(a+b);
    }
    public static void add(int a, double b){//1 tane AW var
        System.out.println(a+b);
    }                                                       //java benze ihtimalli methodlari istemez
                                                           //yani 3. veya 4. methodan birini silmemiz lazim
    private static void add(double a, int b){//1 tane AW var
        System.out.println(a+b);
    }
    private static void add(int a, int b, int c){//AW yok ama uc parametre var
        System.out.println(a+b);
    }

}
