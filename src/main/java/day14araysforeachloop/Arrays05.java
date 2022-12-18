package day14araysforeachloop;

import java.util.Arrays;

public class Arrays05 {

    public static void main(String[] args) {

        //note: sort() method'u sayisal data typelarini kucukten buyuge siralar(ascending order)
        //note: sort() method'u String data typelarini alfabetic olarak siralar(alphabetical order)
        //note3: ascending order + alphabetical order ==> Natural order
        //note 4: sort() methodu array elemanlarini "Natural Order" a gore siralar


        //Note 5: binarySearch() method'u bir elemanin bir
        // array'de olup olmadigini kontrol etmek icin kullanilir.
        //binarySearch() method'unu kullanmadan once sort() method'unu kullaniriz.


        String[] colors = new String[6];

        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));//[Blue, Brown, Green, Orange, Red, Yellow]

        int num1 = Arrays.binarySearch(colors, "Blue");
        System.out.println(num1);// 0 ==> Var hem de indexi sifir
        int num2 = Arrays.binarySearch(colors, "Orange");
        System.out.println(num2);// 3 ==> var hem de indexi 3
        int num3 = Arrays.binarySearch(colors, "Tarik");// 0 ==> Var hem de indexi sifir
        System.out.println(num3);//-6 ==> "-" ==> bu eleman yok demek (binary searchte)
                                 // 6 ise olsaydi 6. eleman(index degil) olurdu demek

    }
}
