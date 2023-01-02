package practice;

import java.util.Scanner;

public class WhileCountSum {
    public static void main(String[] args) {

        //take number from user to sum
        // if the number of given number exceeds 10 or
        // sum exceeds 500, print "you entered ... numbers, the sum is ... "

        Scanner input = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        int counter = 0;
        while (counter < 10 && sum < 500){
            System.out.println("please enter numbers to sum : ");
            num = input.nextInt();
            sum += num;

            counter++;
            System.out.println("for continue type 'c' / for break type 'b' ");
            String continueOrBreak = input.next();
            if (continueOrBreak.equals("c")){
                continue;
            } else if (continueOrBreak.equals("b")) {
                break;
            }
        }

        if (counter < 10 && sum < 500){
            System.out.println("you entered " + counter + " numbers, the sum is " + sum);
        }else {
            System.out.println("that's enough, you entered "
                    + counter + " numbers. the sum is :  " + sum);
        }






    }
}















