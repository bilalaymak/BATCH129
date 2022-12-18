package day14araysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Example 2: int array olusturun, icine 6 tane eleman yerlestiriniz,
        // bu elemanlarin en kucu ile en buyugunun toplamini yazdiriniz

     //   Integer ages[] =  new Integer[6]; Wrapper da olabilir data type
        // []'i ister data type'in sonrasina ister name'den sonrasina da
        // yazabiliriz

        int ages[] = new int[6];
        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;

        System.out.println(Arrays.toString(ages));//[20, 23, 19, 44, 15, 32]

        //1. yol
/*
        Arrays.sort(ages);//(sort methodu) bu koddan sonrasinda arraydaki
        // elemanlar kucukten buyuge dogru siralaniyor
        // yani sort edildi
        System.out.println(Arrays.toString(ages));//[15, 19, 20, 23, 32, 44]

        System.out.println(ages[0] + ages[ages.length-1]);//59

        //ages[ages.length-1] arrayin son elemanini verir
        //ages.length-1 methodu arrayin length'ini verir
        //length-1 son elemanin indexini verir
*/

        // 2. yol ==> tercih edilen yol
        //Bir min kutusu olustur icine ilk sayiyi min kabul et koy
        //Kutuda ki sayiyi 2. ile karsilastir kücügünü bul kutuya koy
        //Kutuda ki sayiyi 3.sayi ile karsilastir min' i bul kutuya koy
        //Kutuda ki ile 4.sayiyi karsilastir min' i bul kutuya koy
        //Kutuda ki sayi ile 5.sayi yi karsilastir min' i bul kutuya koy
        //Kutuda ki sayi ile 6.sayi yi karsilastir min' i bul kutuya koy

        int minimum = ages[0];
        int maximum = ages[0];

        for( int w : ages){
           minimum = Math.min(minimum,w);// minimum alma methodu
            maximum = Math.max(maximum, w);// maximum alma methodu
        }
        System.out.println(minimum +maximum);//59









    }
}




























