package day12forloopwhileloop.eng;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {


            /*
         Username is "admin", Password is "pwd123"

         Ask user to enter username and password
         User should see "Enter your username and password" message

         If he enters correct credentials he should get "You are in your account!" message

         Otherwise, he should see "Enter your username and password" message 3 times
         After 3 times he should get "Your account is blocked" message
           */

        Scanner input = new Scanner(System.in);


        System.out.println();

        int counter = 0;
        do {
            if (counter==3){
                System.out.println("your account was blocked");
                break;
            }
            System.out.println("enter your username");
            String username = input.next();
            System.out.println("enter your password");
            String pass = input.next();
            if (username.equals("admin") && pass.equals("pwd123")){
                System.out.println("you are in your account");
                break;
            }else {
                System.out.println("your username or password is wrong");
            }
            counter++;
        }while (true);


    }
}
