package day05TypeCastingstringmanipulation;

public class TypeCasting01 {
    public static void main(String[] args) {
          /*
  Numeric primitive data type'larının birbirine dönüştürülmesine "Type Casting" denir.
  Numeric Data Type'lar byte-short-int-long-float-double

  Note 1: Küçük data type'larını büyük data type'larına çevirmeyi Java otomatik olarak yapabilir.
          Bu işleme "AutoWidening" (Otomatik Genişletme) denir.

  Note 2: Büyük data type'larını küçük data type'larına çevirmek riskli bir iştir,Java bu riskli işi otomatik olarak yapmaz.
          Bu işlemi kod yazanlar yapar.
          Bu işleme "ExplicitNarrowing"(açıktan daraltma) denir


 */

        // byte data type'ını int data type'ına çevirin

        byte age = 13;

        int ageInt = age; //AutoWadening

        //long data type'ını short data type'ına çevirelim

        long weight = 234;

        short weightInt = (short) weight; // Explicit Narrowing

        // int data type'ını float'a çevirin

        int population = 85000000;
        System.out.println(population);

        float populationFloat = (float) population;
        System.out.println(populationFloat);

        //double data type'ını short'a çevirin

        double fiyat = 99.99;
        System.out.println(fiyat);

         short fiyatShort = (short) fiyat;
        System.out.println(fiyatShort);

        //dikkat!
        //Dikkat!
        //Donusum yaptiginiz sayi(260), donuseceginiz data type'inin sinirlari disinda ise, Java kullandiginiz sayi ile "mod" islemi
        //yapar ve mod isleminin sonucu sizin yeni degeriniz olur
        short num = 260;
        System.out.println(num); //260

        byte numByte = (byte) num;
        System.out.println(numByte); //4

        short n = 1023;
        System.out.println(n);//1023

        byte nByte = (byte)n;
        System.out.println(nByte);//-1 büyük sayı(256) kullanmak yerine küçük sayıyı yani -1















    }
}
