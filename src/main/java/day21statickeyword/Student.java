package day21statickeyword;

public class Student {

    /*
    1) static variable veya static methodlar(class member) tum object'ler icin ortak elemanlardir
    2) static class memberlar uzerinde yapilan yum degisiklikler tum objectleri etkiler
    3) static class memberlar class'a, non-static class memberlar objectlere monte edilir
       mesela bir class'tan 100 tane object olusturdugunuzda non-static olanlar 100 kere olusturulur
       ama static olanlar object sayisindan bagimsiz olarak bir kere olusturulur
    4) static clas memberlara ulasmak icin object olusturmaya gerek duyulmaz, ama non-static class memberlara
       ulasmak icin object olusturmak sarttir
    5) static variablelarin diger adi class variable'dir
       non-static variablalerin diger adi instance(gorunum) variable/veya object variable'dir
     */

    public static String stdName = "Tom Hanks";
    public int age = 13;

    //ogrenci isminin olk harflerini veren methodu olusturunuz

    public static String getInitials(String name){
        String first = name.substring(0,1);
        String second = name.split(" ")[1].substring(0,1);
        return first + second;
    }

    //ogrenci ismindeki sesli harfleri(aeiou) sayan bir method olusturunuz
    public int countVowels(String name){
        int counter = 0;
        for (int i = 0; i < name.length(); i++){
            char ch =  name.toLowerCase().charAt(i);

            switch (ch){
                case 'a' :
                case 'e' :
                case 'i' :
                case 'o' :
                case 'u' :
                    counter++;
                    break;
            }
        }
        return counter;
    }


}















