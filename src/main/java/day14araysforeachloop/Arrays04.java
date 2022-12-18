package day14araysforeachloop;

public class Arrays04 {
    public static void main(String[] args) {

        //example 1: String bir array olusturun,
        // 6 eleman ekleyiniz,
        // yellow'dan onceki elemanlari yazdirin


        String[] colors = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        for (String w:
             colors) {
            if (w.equals("Yellow")){
                break;
            }
            System.out.println(w);//red orange blue
        }
        //Example 2:String bir array olusturunuz,6 eleman ekleyiniz,
        // Yellow'dan sonraki elemanlari yazdiriniz

        String[] color = new String[6];
        color[0] = "Red";
        color[1] = "Orange";
        color[2] = "Blue";
        color[3] = "Yellow";
        color[4] = "Green";
        color[5] = "Brown";

        //burada biz for each loop kullanamiyoruz. foreachloop hep bastan baslar
        //biz sondan baslayacagiz, onun icin forloop kullanacagiz

        //1. yol
        //elemanlari son elemandan almaya baslayacagimiz icin foreachloop kullanamam
        //dolayisiyla forloop kullaniyoruz

        for (int i = color.length-1; i >= 0 ; i--) {
            if (color[i].equals("Yellow")){//arraylerde length methodu ()parantezsiz kullanilir
                break;//false oldugu icin break calismayacak ve asagidaki kodu calistiracak (Yellow'a kadar)
            }
            System.out.println(color[i]);
        }

        //2.Yol:
        //Yellow elemaninin index'ini bul ve o index'den daha buyuk index'e sahip olan elemanlari yazdir.
        int counter = 0;
        //Red, Orange, Blue, Yellow, Green, Brown
        for(String w : color){
            if(w.equals("Yellow")){
                break;
            }
            counter++;
        }

        for(int i=counter+1; i<color.length; i++){
            System.out.println(color[i]);
        }





    }
}













