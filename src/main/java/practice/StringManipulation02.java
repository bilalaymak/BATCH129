package practice;

public class StringManipulation02 {
    public static void main(String[] args) {

        String a = "tell something bro";

        //practice 1: "bro" ile bitip bitmediğini kontrol edin

        boolean isEnd = a.endsWith("bro");
        System.out.println(isEnd);


        //practice 2: bir kelimeyi başka bir kelime ile değiştirme

        String a1 = a.replace("bro","dude");
        System.out.println(a1);

        //practice 3:
        String a2 = a.replace("tell","say");
        System.out.println(a2);

        String a3 = a.replace('e','*');
        System.out.println(a3);

    }
}
