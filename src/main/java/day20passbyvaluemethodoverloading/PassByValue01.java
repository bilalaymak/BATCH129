package day20passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {

        /*
        1) java pass-by-value sayesinde variablelarin orjinal degerlerini koruma altina alir

         */

        double shirt = 100;
        double studentShirtPrice = discount("student",shirt);
        double veteranShirtPrice = discount("veteran", shirt);
        double seniorShirtPrice = discount("senior",shirt);
        System.out.println("shirt = " + shirt);//100
        System.out.println("studentShirtPrice = " + studentShirtPrice);//studentShirtPrice = 90.0
        System.out.println("veteranShirtPrice = " + veteranShirtPrice);//veteranShirtPrice = 80.0
        System.out.println("seniorShirtPrice = " + seniorShirtPrice);//seniorShirtPrice = 95.0

        shirt = discount("veteran", shirt);
        System.out.println("shirt = " + shirt);//shirt = 80.0 burada orjinal degeri degistirdik

    }
    //bu method bass by value'dur
    public static double discount(String state, double price){
        switch (state){
            case  "student":
                price = price * 0.90;
                break;
            case "veteran" :
                price = price * 0.80;
                break;
            case "senior" :
                price = price * 0.95;
                break;
            default:
                price = price;
        }
        return price;
    }



}
