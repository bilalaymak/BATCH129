package day24accessmodifiersinheritance;

import day23.Snake;

public class AnilmalsRunner {
    public static void main(String[] args) {


        Cat myCat = new Cat();
        myCat.meow();
        myCat.drink();
        myCat.eat();

        Snake yourSnake = new Snake();

        yourSnake.tiss();
        yourSnake.eat();
      //  yourSnake.drink(); yazamiyoruz cunku drink() methodu default, dolayisiyla baska packagedan inherit edemiyoruz

    }
}
