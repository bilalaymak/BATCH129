package day11forloop;

public class ForLoop01 {
    public static void main(String[] args) {


        //question 1
        //verilen stringde ilk 'a' harfinden onceki tum karakterleri yazdirin
        String s = "Tramvay";

        for(int i = 0; i<s.length(); i++){


            char ch = s.charAt(i);
            if (ch =='a'){
                break;
            }
            System.out.print(s.charAt(i));
        }

        System.out.println("");
        System.out.println("***************************");

        //question 2
        //verilen stringde son'a'dan sonraki tum karakterleri ters sirada yazdirin
        //"Germany" ==> yn

        String t = "Germany";

        for(int i=t.length()-1; i>=0; i--){
            char ch = t.charAt(i);
            if(ch=='a'){
                break;
            }
            System.out.print(ch);
        }



    }
}
