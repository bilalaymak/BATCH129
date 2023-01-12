package day24accessmodifiersinheritance;

public class Student {
    public String name = "Tom Hanks";
    //public
    //name herkes tarafindan bilinebilir, o yuzden public yaptim
    String stdID = "TH2023HU12001";
    //default
    //student ID okul yonetimindeki herkes tarafindan bilinebilir(package), o yuzden default yaptik
    //default, package private'dir
    //when we do not mention any access modifier, it is called default access modifier
    protected int accountNum = 76512345;
    //protected
    //account number, ben ,esim ve cocuklarim tarafindan bilinebilir, o yuzden "protected" yaptim.
    //classes cannot be protected, not child of class in another class cannot reach protected one
    private int balance = 123000;
    //private
    //hesabimdaki para miktari sadece benim tarafimdan bilinmelidir, bu yuzden "private" yaptim
    // a class cannot be private

    /*
    1)Access modifier'lar genis'den dara; public > protected > default > private
2)Class'lar protected ve private olamazlar, sadece public ve default olabilirler
3)Access Modifier'lar ne ise yarar?
        Variablelara methodlara classlara ulasmayi duzenler.
4)Kac tane access modifier var ?
        public > protected > default > private
        i) "public"ler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
        ii) "protected" ayni package'in icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
        iii) "default" sadece ayni packageden ulasilabilir.
        Bu yuzden "default"larin diger adi "package private"dir
        iv) "private"  sadece class icinden ulasilabilir, class disina cikildiginda ulasilamaz
        v) "protected" ile "default"un farki nedir ?
           Package disina ciktigimizda childlardan "protected"lara ulasabiliriz. "default"lara ulasamayiz.

    Access modifierlar genisten dara dogru;
        public > protected > default > private
Class'lar protected ve private olamazlar. Sadece public ve default olabilirler.

Access Modifier'lar ne ise yarar?
    -Variablelara methodlara classlara ulasmayi duzenler.
Kac tane access modifier var ? 4. public > protected > default > private

publicler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
protected ayni packagein icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
default sadece ayni packageden ulasilabilir. Bu yuzden defaultlarin diger adi package private'dir
private

protected ile defaultun farki nedir ?
Package disina ciktigimizda childlardan protectedlara ulasabiliriz. Defaultlarda ulasamayiz.




     */
}
