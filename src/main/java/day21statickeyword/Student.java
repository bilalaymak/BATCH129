package day21statickeyword;

public class Student {

    /*
    1) static variable veya static methodlar(class member) tum object'ler icin ortak elemanlardir
    2) static class memberlar uzerinde yapilan yum degisiklikler tum objectleri etkiler
    3) static class memberlar class'a, non-static class memberlar objectlere monte edilir
       mesela bir class'tan 100 tane object olusturdugunuzda non-static olanlar 100 kere olusturulur
       ama static olanlar object sayisindan bagimsiz olarak bir kere olusturulur
    4) static clas memberlara ulasmak icin object olusturmaya gerek duyulmaz, ama non-static class memberlara
       ulasmak icin object olusturmak sarttir

     */



    public static String stdName = "Tom Hanks";

    public int age = 13;

}
