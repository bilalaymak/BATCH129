package day13arraysdowhileloops.arrays;

import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {

        int a = 12; // bu yapinin  icind sadece bir tane data depolanabilir
        // ama biz kod yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz
        //bir yapinin icinde coklu data depolayabilme icin Java "Array" yapisini olusturmustur


        /*
        Java'da asamalar
        what? bu app nedir?
        why?  neden bu app?
        Simple implementations
        mid level imp.    ==> bu seviye interviewler icin yeterlidir
        advanced level imp.
        project
         */


        //Array nasil olusturulur?
//                        kac data koyacagimizi soyledik
   //     String stdNames[] = new String[5]; su haliyle konsol ciktisi @3cb5cdba olan kisim
   //Arrayin adresi olacaktir. burada sadece 5 girdilik yer ayirdik

        //Array olusturmak icin Array elemanlarinin "daya type" i
        // ve "eleman sayisi " mutlaka yazilmalidir
        String stdNames[] = new String[5];


        //Array konsola nasil yazdirilir?
        //toStrimg() method'unu kullanmadan sadece array ismi ile yazdirirsaniz Java
        // o Array'in adresini yazdirir

        System.out.println(Arrays.toString(stdNames)); //[null, null, null, null, null]

        //Array'e eleman ekleme nasil yapilir?

        stdNames [2] = "Ajda";
        stdNames [0] = "Cuneyt";
        stdNames [1] = "Kemal";
        stdNames [3] = "Ezel";
        stdNames [4] = "Besir";
        System.out.println(Arrays.toString(stdNames));//[Cuneyt, Kemal, Ajda, Ezel, Besir]

        //Array'den specific bir elemani almak

        System.out.println(stdNames[2]);//Ajda

        //example 1: Array'daki her elemani sonuna "!" isareti koyarak yazdirin

        for (int i = 0; i < stdNames.length ; i++)// Stringlerde length() yazardik
        //Array'lerde () parantez koymayiz
        {
            System.out.println(stdNames[i] + "!");
        }
        /*cikti
         Cuneyt!
         Kemal!
         Ajda!
         Ezel!
         Besir!
          */











    }
}
