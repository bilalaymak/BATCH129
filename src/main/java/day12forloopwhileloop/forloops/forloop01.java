package day12forloopwhileloop.forloops;

import java.util.Scanner;

public class forloop01 {
    public static void main(String[] args) {

        /*
      Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
            X X X X X
            X X X X X
            X X X X X
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisini(row) giriniz");
        int row = input.nextInt();
        System.out.println("Sutun sayisini(column) giriniz");
        int column = input.nextInt();

        for(int i = 0; i<=row; i++){

            for(int k = 1; k<= column; k++){
                System.out.print("X ");
            }
            System.out.println();//alt satira gecmek icin bos sout yazdik
            //2. sutunun alt satira gecmeyi saglar(loop icinde bos sout olusturduk dikkat!)

        }



    }
}
