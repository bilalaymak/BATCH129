package day14araysforeachloop.eng;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //example 1: create an integer array, add 6 elements in it. find the sum of all elements

        int nums[] = new int[6];
        nums[0] = 13;
        nums[1] = 24;
        nums[2] = 12;
        nums[3] = 19;
        nums[4] = 34;
        nums[5] = 21;
        int sum =0;
        for (int w: nums){
            sum = sum + w;
        }
        System.out.println(sum);//123

        //example 2: create an integer array type code to find the sum of min and max value
        //[12,45,9,56] ==> 9+56 = 65
        //sort() ==> [9,12,45,56]

        int num[] = new int[4];
        num[0] = 12;
        num[1] = 45;
        num[2] = 9;
        num[3] = 56;

        System.out.println(Arrays.toString(num));//[12, 45, 9, 56]
        //sort() puts elements in ascending order automatically
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));//[9, 12, 45, 56]

        int sumOfMinMax = num[0] + num[num.length-1];//
        System.out.println(sumOfMinMax);//65

    }
}
