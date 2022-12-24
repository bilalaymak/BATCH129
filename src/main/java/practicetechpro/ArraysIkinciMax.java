package practicetechpro;


import java.util.Arrays;

public class ArraysIkinciMax {
    public static void main(String[] args) {

             /*
        Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' değerleri bulan bir kod yazınız.
        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        output: min:-90, max:10001, secMax: 8787
       */

        int arr[] = { 100, 10001, -90, 845, 8787, 898, 0, 1};

        //1. yol

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[-90, 0, 1, 100, 845, 898, 8787, 10001]
        //natural order==> kucukten buyuge, alfabetik siralama(buyuk harfler basta)
        System.out.println("min:" + arr[0] + " max: "
                + arr[arr.length-1] + " scndMax: " + arr[arr.length-2]);//length-1 vermemiz gerekir
        //min:-90 max: 10001 scndMax: 8787


        //2. yol








    }
}













