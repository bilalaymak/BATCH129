package day22staticblocksconstructors;

public class Car {
    /*
        constructor nedir?
        Classtan object uretmemize yarayan code blocklaridir

        class olusturdugumuzda java bize otomatik olarak bize costructor verir
        ama bu constructor gozle gorulmez(invisible)
        gozle gorulmeyen java tarafindan verilen bu constructorlara "default constructor" denir

        "default constructor"lar "Car(){}" seklindedir
        "default constructor"larin cok fazla ozelligi yok sadece bize object uretmek icin yapilmistir
        biz "default constructor"lar kullanmaktan cok ozelliklerini kendimiz belirledigimiz objectler uretiriz

        biz kendi constructorimizi olusturdugumuzda java default constructori siler
        bir classin icinde farkli paramaetreler kullanarak istediginiz kadar constructor olusturabilirsiniz
        fakli constructorlar sayesinde bir classdan farkli farkli objectler olusturabilirsinz

        interview sorusu:
        method ile constructorin farki var midir? varsa nedir?
          method ile constructor farkli yapilardir
            i) methodlarda return type vardir ama constructorlarda return type yoktur
            ii) methodlarin ismi yaptiklari islere gore developerlar tarafindan belirlenir
                constructorlarin ismi ise herzaman class ismi ile ayni olmalidir
            1- constructors do not have return type but methods have.
            2-  Constructor sames must be same with the class name because of that you can nat decide constroctor names
               but method names can be assigned by developer



     */
    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    //gelellikle constructorlari public yapariz

    public Car(String make,String model, int year, boolean hybrid){//constructor
        this.make = make; //this.make bu class daki make i benim yaptigim make yap demek
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }

    public Car(String make,String model){
        this.make = make;
        this.model = model;
        if (year==2023){
            this.year=0;
        }
        if (hybrid == true){
          this.hybrid = false;
        }
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }



}
