package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Mahsun");
        names.add("Muslum");
        names.add("Orhan");

        List<String> females = new ArrayList<>();
        females.add("Ajda");
        females.add("Emel");

        //names.containsAll(females) "names" listinde "females" listindeki
        // "tum elemanlarin" var olup olmadigini kontrol eder
        //tamami varsa bize "true" verir, herhangi biri yoksa bize false verir
        boolean r = names.containsAll(females);// names listinde females listindeki hersey var mi?true or false
        System.out.println(r);//false

        List<String> subList = names.subList(1,4);
        //2. index dahil degildir==>names listindeki indexi 1,2 ve 3 olan elemanlari bir list'in icinde bize verir
        System.out.println(subList);//[Cuneyt, Mahsun, Muslum]

        names.retainAll(females);
        //kesisim kumesini veriyor ve boolean donduruyor || dokunulacak olan ilk listtir(names)
        System.out.println(names);//[Ajda] ==> ortak eleman Ajda
        System.out.println(females);//[Ajda, Emel]


        //example 1: elektronik aletler ve ev aletleri listleriniz var
        //           elektronik ev aletlerini listeleyiniz

        List<String> electronics = new ArrayList<>();

        electronics.add("TV");
        electronics.add("Radio");
        electronics.add("Refrigerator");
        electronics.add("Mobile Phone");
        electronics.add("Notebook");

        List<String> homeGoods = new ArrayList<>();

        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("TV");

        //homeGoods.retainAll(electronics) homeGoods
        // ile electronics Listlerinin ortak elemanlarini homeGoods listi icinde verir
        //homeGoods listindeki ortak olmayan elemanlari siler
        homeGoods.retainAll(electronics);//homeGoods icinden electronic olanlari bize verecek
        System.out.println(homeGoods);//[Radio, TV]

        //isEmpty() listte hic eleman yoksa bize true verir, bir veya daha fazla eleman varsa bize false verir
        //"isEmpty()" esasinda "names.size()==0" demektir
        names.isEmpty();//listte hic eleman yoksa true verir

        System.out.println(names.hashCode());
        //2041509 sout icerisinde adresi veriyor, names'in unique adresini veriyor


    }
}











