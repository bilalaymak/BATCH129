package day04asciiwrapperclassoperatorsmemoryusage;

public class WrapperClass {

    public static void main(String[] args) {

       int n =12;   //n yazıp nokta koyarsak hiç metod göremeyiz
                    //çünkü primitiveler method içermez
       Integer m =12;

       byte b = 23;
       Byte r = 43;
       // mothodlar çıkıyor r.

      //method çıkmıyor  b.

        //Example 1: short data tipinin min. ve max. değerlerini kod yazarak bulunuz

        short shortMax = Short.MAX_VALUE;
        System.out.println("shortMax = " + shortMax); //32767

        short shortMin = Short.MIN_VALUE;
        System.out.println("shortMin = " + shortMin); //-32768

        //Example 2: int data tipinin min. ve byte max. değerinin toplamını bulunuz

        int intMin = Integer.MIN_VALUE;//-2147483648
        byte byteMax = Byte.MAX_VALUE;// 127

        System.out.println("intmax ve bytemin toplamı =" + (intMin + byteMax));

//Example 3: primitive int'i Wrapper Integer'a çevirin(Autoboxing)

        int num = 22;
        Integer wrapperNum = num;  // primitive Wrapper'a dönüşmüş oluyor

        System.out.println(wrapperNum);//22 verecek

        // Wrapper Byte'ı primitive byte a çevirin(Unboxing)

        Byte k = 43;

        byte primitiveK = k;
        System.out.println(primitiveK); //43

        //Example 4: primitive char 'ı Wrapper Character'e çeviriniz
        // ii: Wrapper Boolean'ı primitive boolean'a çeviriniz

        char c = 'A';
        Character wrapperc = c;
        System.out.println(wrapperc);

        Boolean booleanB = true;
        boolean priB = booleanB;
        System.out.println(priB);

        //String olan ki fiyatın toplamını ekrana yazdırınız

        String shirt = "2300";
        String shoes = "5200";

        System.out.println(shirt +shoes); // sonuç : 23005200 olur


        //valueOf() methodu tüm karakterleri rakam olan Stringleri sayılara çevirir
        //rakam dışı karakterlerde hata verir

        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);//7500

        //Example 6: String olarak verilen iki fiyatın toplamını veriniz

        String tv = "$11000";
        String radio = "$3000";

        int totalPrice = Integer.valueOf(tv) + Integer.valueOf(radio);
        //burada hata verir "$" işaretinden dolayı







    }
}
