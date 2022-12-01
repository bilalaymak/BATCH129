package practice;

public class Car {

    public String model = "Corolla";
    public int fiyat = 200000;

    public static void main(String[] args) {
        // Class ismi + objeye verilecek isim + = + new + Class ismi +();
        Car myCorolla = new Car();
        System.out.println("myCorolla.fiyat = " + myCorolla.fiyat);
        System.out.println("myCorolla.model = " + myCorolla.model);
        myCorolla.hareket();
        myCorolla.dur();
    }

    public void hareket() {
        System.out.println("Toyota hızlı hareket eder!");
    }

    public void dur(){
        System.out.println("Toyota güvenle durur!");
    }
}
