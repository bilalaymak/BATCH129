package day14araysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Example: String bir array olusturunuz,
        // 6 tane eleman yerlestiriniz,
        // character sayisi 5'den cok olan elemanlari siliniz

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        System.out.println(Arrays.toString(colors));//[Red, Orange, Blue, Yellow, Green, Brown]
        //orange ve yellow'un karakter sayilari 5'den buyuk, bunlari silecegiz
        // yani eleman sayisi <=5 olmasi gerekiyor

        //logic: yeni bir array olusturup, karakter sayisi 5 ve 5den kucuk olan elemanlari
        // yeni arraya transfer edecegiz, boylelikle yeni arrayimizde karakter sayisi 5den buyuk olan
        // hic bir eleman olmayacak

        //soru: hocam, array olusturmak icin iki sey belirlenmelidir
        // 1) elemanlarin data type i
        // 2) yeni arrayde kac tane eleman olacak

        //verilen array'de eleman sayisi 5 ve 5'den kucuk olan kac eleman var, bulmaliyiz

        int counter = 0;
        for (String w : colors){
            if (w.length()<=5){
                counter++;
            }
        }
        System.out.println(counter);//4

        String newColors[] = new String[counter];

        int idx = 0;
        for (String w : colors){
            if (w.length()<=5){
                newColors[idx] = w;
                idx++;
            }

        }
        System.out.println(Arrays.toString(newColors));//[Red, Blue, Green, Brown]







    }
}













