package day12forloopwhileloop.whileloops;

public class WhileLoop01 {
    public static void main(String[] args) {

//Example 1: 3'den 10'a kadar tamsayilari console'a yazdiriniz

        //for ile while arasindaki farklar
        //1. yol for loop

        for (int i = 3; i <11 ; i++) {
            System.out.print(i +" ");
        }

        System.out.println();

        //2. yol while loop
        int i = 3;
        while (i<11){
            System.out.print(i + " ");
            i++;

            //bazen while for dan daha fazla kullanilir
            //while'in okunurlulugu daha fazla oldugu icin while daha fazla kullanilir
        }
        System.out.println();
        //Example 2: 23'den 12'a kadar cift tamsayilari console'a yazdiriniz

        int k = 23;
        while (k > 11){
            if ( k%2==0){
                System.out.print(k + " ");
            }
            k--;
        }

        System.out.println("*****************");
        //example 3: verilen bir tam sayinin rakamlari toplamini konsola yazdiran kodu yazdirin
        //interview sorusu

        int num = 57864;
        num = Math.abs(num); // burasi num icin negatif degerler icin yaptigimiz tamir
        int sum = 0;

        while (num>0){


          sum = sum + num % 10; //burasi onemli

            num/=10; // decrement yapiyoruz bolme ile
        }
        System.out.println(sum);




    }
}
