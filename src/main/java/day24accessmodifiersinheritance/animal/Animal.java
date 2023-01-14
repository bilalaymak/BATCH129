package day24accessmodifiersinheritance.animal;

public class Animal {

          //ortak ozellikleri barindiran classa ==> parent class denir, Super class da denir
          //classa ozel ozellikleri barindiran classlara child class denir, sub class da denir
              //extends keywordunu kullanarak child yapilir

/*

           Inheritance'in faydalari;
          1) Code standardında tekrar iyi değildir.
          2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
          3) Gelişime update'e açık olmalıdır
          4) Code atomic yapıda olmalı.
     Note 1:  "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)
     Note 2: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız
     Note 3: "public" methodlar "child classlar tarafindan kullanilabilir"
             "child classlar tarafindan kullanilabilir" demek "inherit edilebilir" demektir
     Note 4: "protected" methodlar "inherit edilebilir"
             cunku "protected" olan method ve variablelar child'lar tarafindan kullanilabilir
     Note 5: "default" methodlar objectin uretildigi class ile ayni package'da olduklari surece "inherit edilebilir"
              Ama default method ile object'in uretildigi class farkli package'lerde ise inherit edilemezler
     Note 6: "private" methodlar "inherit edilemezler"
     Note 7: java "birden fazla parenti"(multiple inheritance java tarafindan desteklenmez) onaylamaz
             sadece bir tane parent olabilir
     Note 8: child parent --> parent -->  grand parent --> grand grand parent .. ... Object Class
             seklinde ilerleyen inheritancelara "multi-level inheritance" denir
     Note 9: Object Class butun data typelarin, tum Java classlarinin ortak atasidir (hz. ademi)
     Note 10: javada "object class" haric tum classlarin parenti vardir
     Note 11: javada "parent" dan "child" a olan iliskilere "HAS-A Relationship" denir
              javada "child" dan "parent" a olan iliskilere "IS-A Relationship" denir
     Note 12: java'da her class'in bir tane default constructor; i vardir
              bu default constructor class'in icinde gorunmez cunku default constructor "Object Class" icindedir
              Bizim classimiz default constructora ihtiyac duydugunda parent olan "object class"a gider ve oradaki constructori kullanir
 */

       protected void eat(){// child class extends edilmezse bu methoda ulasamayiz
           System.out.println("animals eat..");
       }
   void drink(){
        System.out.println("animals drink..");
    }


}
