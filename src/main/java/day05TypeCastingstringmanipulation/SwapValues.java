package day05TypeCastingstringmanipulation;

public class SwapValues {
    public static void main(String[] args) {

        //Swap yer değiştirmek demek

        int a = 12;
        int b = 5; // Swaptan sonra ==> a=5 ve b =12

        int temp = 0; //geçici kap


        System.out.println("a: " + a);
        System.out.println("b: " + b);


        //1. YOL
        // 1. adım
        temp = a;
        //2. adım
        a = b;
        //3. adım
        b = temp;

        System.out.println("a: "+ a); //5
        System.out.println("b: " + b);//12

        /* 1. Adim
        temp = a;  a'daki degeri temp'e koyarak a'yi bosalttik.
        2. Adim
        a = b; // b'deki degeri, bosalan a'ya koyduk.
        3. Adim
        b = temp; a'daki degeri temp'e koymustuk. Bu sefer de temp'teki a'nin ilk degerini b'ye aktardik.
        Swap (yer degistirme) islemi bu adimlar sonunda tamamlandi.

         */

        //2. YOL
        //interviewlerde bu soruluyor


        int x = 12;
        int y = 5;

        x = x + y; //12+5=17=x
        y = x - y; //17-5=12=y
        x = x - y; //17-12=5=x ==> x = 5 , y = 12



















    }
}
