package day11forloop;

public class ForLoop03 {
    public static void main(String[] args) {

        //example 1
        // verilen bir stringi tersten yazdiriniz

        String s = "Germany";
        String t = "";

        for (int i = s.length() - 1; i >= 0; i--) {

            t = t + s.charAt(i);

        }
        System.out.println(t);//avaJ

        // print islemi loopun icine koyarsak t'nin her asamadaki halini gosterir

        /*
        y
        yn
        yna
        ynam
        ynamr
        ynamre
        ynamreG
         */


        //example 2

        //size verilen Stringin "Palindrome" olup olmadigini kontrol ediniz
        // civic==> tersten yazilinca yine "civic"
        //logic = Strinigi ters cevir sonra da duz hali ile ters halini karsilastir
        // ayni ise "Palindrome"

        // interview de sorunun mantigini sesli dusun, mantigini anlat once *****

        String duz = "civic";
        String ters = "";

        for (int i = duz.length()-1; i>=0; i--){
            // char ch = duz.charAt(i); yapabiliriz kisaltmak icin kodu
            ters = ters + duz.charAt(i);

        }
        if(duz.equals(ters)){ //stringlerin esitligi equals ile yapildi //buyuk harf kucuk harf ignore edersek
            //duz.equalsIgnoreCase(ters) yapariz
            System.out.println(duz +": Palindrome'dur");
        }
        else {
            System.out.println(duz +": palindrome degildir"); //ikisini de duz yapiyoruz
            //// (neden ters degil in cevabi)
        }


















    }
}
