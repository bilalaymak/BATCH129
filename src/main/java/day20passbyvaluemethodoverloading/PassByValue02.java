package day20passbyvaluemethodoverloading;

public class PassByValue02 {
    public static void main(String[] args) {

    String name = "Tom Hanks";
    String updatedName = updateName(name,"Jr.");
        System.out.println("name = " + name);//burada add yapmadi
        // cunku java orjinali degistirmedi copy i degistirdi
        System.out.println("updatedName = " + updatedName);//updatedName = Tom Hanks Jr.
    }
    public static String updateName(String name, String add){
        name = name + " " + add;
        return name;
    }
}
