package day22staticblocksconstructors;

public class StaticBlocks01 {

    //bir variable olusturdugunuzda, deger atamazsaniz o variable'i "initializa" etmediniz demektir
    //static variablelar, static blocklar icinde initialize edilirse
    // o classin icinde herseyden once hazir hale getirilmis olur
    //bazen main method calistirilmadan once variablelarin hazir hale getirilmesi gerekir
    //bu yuzden static blocklar kullanilir

    //note 1: static blocklar static variablelari initialize etmek icin kullanilirlar
    //nite 2: static blocklar class icinde herseyden once calistirilirlar

    static double pi;
    static String shape;

    static {//once static blocklar calisir
        pi = 3.14;//we initialized the variable
        System.out.println("static block 1");
    }
    static {
        shape = "circle";
        System.out.println("static block 2");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        System.out.println(pi);


    }


}
