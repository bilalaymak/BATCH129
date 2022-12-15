package day11forloop;

public class Forloop04 {
    public static void main(String[] args) {


           // Example 1: 5'ten 8'e kadar tam sayilarin toplamini veren kodu yaziniz.
           //  5+6+7+8==>

        int sum = 0;

        for(int i = 5; i<9; i++){
            sum = sum + i;

        }
        System.out.println(sum);//26   //sout u loop un  icine koyarsak her islem icin sum'in degerini verir


        //example 2 : 7den 9a kadar olan tam sayilarin carpimini veren kodu yaziniz


        int result = 1;  //carpmada baslangic degeri 1 olmali, 0 carpimi 0 yapar

        for(int i =7; i<10; i++){
            result = result * i;
        }
        System.out.println(result);//504


    }
}
