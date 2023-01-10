package day21statickeyword.day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {


        //Date Class
        Date myDate = new Date();//date objesi

        System.out.println(myDate);//Sat Jan 07 23:26:30 EET 2023

        System.out.println(myDate.getTime());//1673123344429 dijital tarih 1 ocak 1970den
        // itibaren suana kadarki milisaniyeyi verir

        //icinde bulundugumuz an(current time) nasil alinir?

        System.out.println(LocalDate.now());//2023-01-07
        System.out.println(LocalTime.now());//23:34:51.417171900 saat dk sny, nanosnye

        //dunyanin herhangi bir saat dilimindeki saati nasil aliriz?
        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Europe/Paris")));
        //2023-01-07T23:41:10.458039700+01:00[Europe/Paris]
        //zoneid icin googlea bakin kita/ulke
        System.out.println(LocalDateTime.now().atZone(ZoneId.of("Europe/Moscow")));
        //2023-01-07T23:46:13.204711+03:00[Europe/Moscow]


        //ileriki bir tarihe nasil gidilir?

        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));
        //2030-07-12


        //ileriki bir tarihe nasil gidilir?

        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));
        //2018-10-05

        //zamanda belli bir bolumu nasil aliriz?

        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());//0:4

        //tarihte belli bir bolumu nasil aliriz?
        System.out.println(LocalDate.now().getMonth() + ":" + LocalDate.now().getDayOfMonth());//JANUARY:8

        //iki tarih nasil karsilastirilir?
        //02/13/2005 - 03/01/2007
        boolean result =  LocalDate.of(2005,02,13).isBefore(LocalDate.of(2007,03,01));
        System.out.println(result);//true


        //tarihlerin formatlari nasil degistirilir
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");//mm'ler dakikalar icin kullaniliyor
        System.out.println(dtf.format(LocalDate.now()));//08/01/2023
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(dtf1.format(LocalDate.now()));//08/Oca/2023
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/M/yyyy");
        System.out.println(dtf2.format(LocalDate.now()));//08/1/2023
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(dtf3.format(LocalDate.now()));//08/Ocak/2023

        //Tarih'lerin formatları nasil degistirilir
        // M--> Tek arakamla ay nosu yazar - MM--> Ikı rakamla ay nosunu yazar-MMM-->Ay ismini ilk uc ısmını yazar
        //MMMM--> ay ısımının tamamını yazar.
        //d--> Tek rakamla gün nosunu yazar  -- dd--> Iki rakamla gun nosunu yazar
        //yy--> Yilin son iki rakamini yazar-- yyyy Yilin tamamini yazar





    }
}













