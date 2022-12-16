package day12forloopwhileloop.forloops;

public class ForLoop05 {
    public static void main(String[] args) {

      //Example 1: Hic sayi kullanmadan 1 den 100'e kadar olan sayilari console'a yazdiriniz

        for (int i = 'd'/'d'; i <'d' ; i++) {
            //ascii degerlerini kullaniyoruz charlarin
            // d'nin ascii degeri 100 oldugu icin d'yi kulandik

            System.out.print(i + " ");

            /*note 1
            bazi looplar hic calismayabilir
             */
            for (int k = 1; k <0 ; i++) {
                System.out.println("hi!");
                //bu loop hic calismadan kirilir(zero execution)

            //note 2
                /*for (int j = 1; j <10 ; j--) {
                    System.out.println("Java is money");
                }
                infinite loop / sonsuz dongu yapar!!
                infinite loop genellikle increment decrement
                kisminda yapilan hatalardan kaynaklanir
                 */

                // baska bir infinite loop

//                for (int h = 1;    ;    ) {//bu durum da infinite loop yapar
//                    System.out.println("hi");
                //sart  kismi yazilmazsa infinite olur

                }

            }
        }


    }

