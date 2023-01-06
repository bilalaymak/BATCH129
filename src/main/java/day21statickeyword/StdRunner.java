package day21statickeyword;

public class StdRunner {
    public static void main(String[] args) {


        //stdName static oldugundan ona ulasmak icin ona ulasmak icin object olusturmadim
        //sadece class ismini kullanmak yeterlidir
        System.out.println(Student.stdName);

        //age non-static oldugundan ona ulasmak icin object olusturmak zorundayiz

        Student std1 = new Student();
        System.out.println(std1.age);

        Student std2 = new Student();

    }
}
