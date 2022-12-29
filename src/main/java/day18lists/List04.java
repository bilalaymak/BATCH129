package day18lists;

import java.util.ArrayList;
import java.util.List;

public class List04 {
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








    }
}
