package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {
    public static void main(String[] args) {
        //example 2: bir Integer List'teki 7 haric tum elemanlarin degerlerini 3 arttiriniz

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(7);
        nums.add(12);
        nums.add(11);


        //1. yol

        for (Integer w : nums){
            if (w==7){
                continue;
            }
            nums.set(nums.indexOf(w), w+3);//set methodu (x,y) x. indexi y'ye cevir demek
            //indexof hep 1. gorunumu verir
        }
        System.out.println(nums);//[15, 26, 7, 15, 14]

        //2. yol//recommended

        for(int i = 0; i<nums.size();i++){
            int element = nums.get(i);
            if(element==7){
                continue;
            }
            nums.set(i,element+3);
        }
        System.out.println(nums);//[18, 29, 7, 18, 17]


        /*
        nums.indexOf(w) ilk gorunumun indexini verir. List tekrarli elemana sahip ise
        nums.indexOf(w) kullanimi risk olusturabilir. bu yuzden bu soruda en guvenli yol "for-loop"tur

        get varolan elemani getirir
        set varolan elemani degistirir

         */






    }
}
