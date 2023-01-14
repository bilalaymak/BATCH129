package day12forloopwhileloop.eng;

public class forLoop01 {
    public static void main(String[] args) {

        //when we need "repeated action" we use loops

        //example 1:
        //type code to calculate the multiplication of integers from 3 to 6
        // 3*4*5*6*==>360

        int mltply = 1;
        for (int i = 3; i <7; i++){
            mltply = mltply * i;
        }
        System.out.println(mltply);//360
        //to see every step of loop, we put sout into the loop


        System.out.println("*****************************");

        //example 2: type code to find the sum of the digits in a given integers
        //5781==> 5+7+8 =21
        int sumOfDigits = 0;
        int num = 578;
        num = Math.abs(num);//to make my code work with negative values, I used Math.abs() method
        for (int i = num; i>0; i = i/10 ){ //i = i/10 ==>gives integers without decimal part for every step
            sumOfDigits = sumOfDigits +  i%10;//gives us the digit in the 1st digit
        }
        System.out.println(sumOfDigits);


        //Note 1: if you want to get the last digit of an integer use "number%10"
        //Note 2: if all numbers are integers in  mathematical operation, the result will be
        //        in  "integer" data type
        //        if the result is in decimal data type, java converts the decimal to integer by
        //        removing the decimal to integers
        //        java does not di "rounding operation" to convert decimal to integers
        //        57/10==> 5        12/5.0 ==> 2.4
        //Note 3: if you use different data types in mathematical operations,
        //        the result will be in the largest data type
        //        12/5.0 ==> 2.4
        //        57.0/10 ==> 5.7
        //        57/10.0 ==> 5.7
        //        57.0/10.0 ==> 5.7

        System.out.println("***********************");

        //example 3: type code to check if a String is "palindrome" or not?
        //           anna, civic, 1234321 is palindrome
        String str = "anna";
        String reverse = "";
        for (int i = str.length()-1; i>=0;i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        System.out.println(reverse);

        //2. step: compare the String with the reverse the decide if it is "palindrome" or not
        if (str.equals(reverse)){
            System.out.println(str + " is apalindrome");
        }else {
            System.out.println(str + " is not a palindrome");
        }














    }
}
