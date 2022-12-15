package day11forloop;

public class ForLoop02 {
    public static void main(String[] args) {

        //example 1
        // verilen stringde 'a' karakteri haric tum karakterleri yazdiriniz
        //"Madagaskar"==> Mdgskr


        String s = "Madagaskar";

        //1. yol
         // hiclik cift tirnakla gosterilmesi gerekiyor
        String t = s.replace("a",""); // replace method u kendi icinde loop kullaniyor
        System.out.print(t);

        System.out.println("");

        //2. yol

        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch != 'a'){
                System.out.print(ch);
            }
        }

        System.out.println("");
        //3. yol
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (s.charAt(i)== 'a'){
                continue; // continue keywoerd u bazi sartlar icin loop un adimlarini atlamamizi saglar
            }
            System.out.print(ch);
        }


    }
}
