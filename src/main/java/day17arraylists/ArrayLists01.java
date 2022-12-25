package day17arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists01 {
    public static void main(String[] args) {

        /*
        1) array listler(list) coklu data depolamak icin kullanilir
        arrayler ve listler coklu data depolamak icin kullanilir
        2) arraylistler(list) non-primitive data type'indeki coklu datalari depolamak icin kullanilir
        listler non-primitive data kabul ederler, arrayler ise primitive data veya reference kabul eder
        3) arraylistleri(list) olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur
           listler eleman sayisinda "flexible"dirlar ama "array" "flexible" degildirler
        4) madem arrayler eleman sayisinda flexible degil, nicin java array leri iptal etmedi?
           i) eleman sayisi belli olan datalari depolamak icin arrayler tercih edilir
           ii) cunku arrayler cok hizli calisir
           iii) arrayler memory de cok az yer kaplar

           Array ile ArrayList'in farki nedir?

1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini
  soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz.
  Array'ler eleman sayisinda "fixed" dirler.
  ArrayList'leri olustururken eleman sayisi soylemeye gerek yok,
  cunku ArrayList'ler eleman sayisinda "flexible"(esnek) dirlar.
2)Array'lerin icine "primitive" ve "reference" lar konabilir.
  ArrayList'lerin icine ise sadece "non-primitive" ler konulur.
3)Array'ler super fast, cok hizli. Array'ler memory i cok az kullanir.
  Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin
  Array kullaniriz, ama eleman sayisi degisken olan coklu datalar icin
  Array kullanma riskini almayin

         */


        //list nasil olusturulur?

        ArrayList<Integer> ages = new ArrayList<>();

        System.out.println(ages);//[]

        //listlere eleman nasil eklenir?
        //list'e eleman eklemek icin add() methodunu kullaniriz
        //ArrayList'lere nasil eleman eklenir?
        //add() her zaman elemani en sona ekler(bizim verdigimiz siralamaya gore ekler)
        // (insertion order)

        ages.add(12);
        ages.add(9);
        ages.add(10);
        //en son siraya eleman eklemek icin index kullanmaya gerek yok direct add methoduyla yazacagiz
        ages.add(1,656);//index 1 e 656 yi koydu
        ages.add(3,777);//index 3 e 777 yi koyduk
        System.out.println(ages);//[12,656,9,777,10]

        //list'e coklu eleman nasil eklenir? veya List'e baska bir List nasil eklenir?
        //bir list'e coklu eleman eklemek icin o elemanlari once bir listin icine koymalisiniz


        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(2,newAges);
        ages.addAll(newAges); // 8,9,10 u newAges list inde en sona ekler

        System.out.println(ages);//[12, 656, 8, 9, 10, 9, 777, 10, 8, 9, 10]

        //bir listteki tum elemanlari nasil silebilirim?

        ages.clear();
        System.out.println(ages);//[] hepsini sildi

        //contains() methodu bir elemanin listte var olup olmadigini kontrol eder
        boolean r = ages.contains(656); //daha once clear() methodunu kullandigimiz icin false verir
        System.out.println(r);

        //bir list'in baska bir list ile ayni olup olmadigini nasil kontrol ederiz?
        //iki listin esit olabilmasi icin ayni indexte ayni elemanlar olmali
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s = names1.equals(names2);
        System.out.println(s);//false

        //example 1:
        // Verilen 2 İnteger List'te "tamamiyla ayni elemanlari olup olmadigini" kontrol eden kodu yaziniz

        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(8);
        num1.add(9);
        num1.add(10);

        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(8);
        num2.add(10);
        num2.add(9);

        Collections.sort(num1);//kucukten buyuge dizdik

        Collections.sort(num2);//listler collectionlarin bir parcasidir,oranin bazi methodlarini kullanabiliriz

        boolean t = num1.equals(num2);
        System.out.println(t);//true




    }
}














