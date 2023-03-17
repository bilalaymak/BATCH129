package day02datatypesmethodcreation;

public class MethodCreation01 {
    public static void main(String[] args) {

        int sonuc = add(30, 50);

        System.out.println(sonuc);

        long carpmaSonucu = multiply(3,6);

        System.out.println(carpmaSonucu);

        int islemSonucu = islem(4,6,7);
        System.out.println(islemSonucu);

        double islemSonucuKup = islem(12.56);
        System.out.println(islemSonucuKup);

    }
    /*method creation main methodun dışına yazılır

     */
    public static int add(int a, int b) {
        return a+b;

    }
    protected static long multiply(int a, int b){
        return a*b;
    }

    /*
    verilen üç sayıdan ilk ikisini çarpan ve sonucu
    üçüncü sayı ile toplayan method'u oluşturunuz ve kullanınız
     */
    public static int islem(int a, int b, int c){
        return a*b+c;
    }

    /* verilen bir ondalık sayının küpünü
    hesaplayan methodu oluşturup kullanınız
     */
    public static double islem(double a){
        return a*a*a;
    }


}
