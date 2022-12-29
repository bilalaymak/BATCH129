package day18lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists02 {
    public static void main(String[] args) {

        //Example 2: bir tane Integer List olusturunuz (interview sorusu)
        //           bu List'te biribirine en yakin iki tam sayiyi yaziniz
        //    [12,23,9,11,35] ==> 12,11
        // 1) sort yaparak kucukten buyuge siralayazagiz

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(9);
        nums.add(11);
        nums.add(35);

        Collections.sort(nums);//Listte sort ettik[9, 11, 12, 23, 35]
        System.out.println(nums);

        int minDiff = nums.get(1)-nums.get(0);//2. elemandan 1. elemani cikardik==. initial durumu

        for(int i = 1; i< nums.size(); i++){//farkini aldigimiz in 1. den 0. iyi cikardigimizdan 1'den basladik
            //num.size() ==> 5
           minDiff =  Math.min(minDiff, nums.get(i) - nums.get(i-1));
        }

        System.out.println(minDiff);//1

        for (int i = 1; i< nums.size(); i++){
            if(nums.get(i)- nums.get(i-1) == minDiff){
                System.out.println(nums.get(i-1) + " and " + nums.get(i));//11 and 12
            }
        }







    }
}












