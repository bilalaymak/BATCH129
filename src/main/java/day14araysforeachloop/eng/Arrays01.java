package day14araysforeachloop.eng;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {


          /*
        1)primitive variables and Strings can store just a single data in them.
        Sometimes we need to "store multiple data " in a single container.To be able to
        store multiple data in a single container, Java created a new structure called "Arrays".

        2) arrays cannot store "non-primitives", if you see "non-primitives" were stored !!!
        actually they are the references of non-primitives. arrays can store:
        i) primitive data types
        ii)references of non-primitives



         */


        int num=12;

        String str="Tom";

        //How to create an Array
        String[] sixthGraders= new String[5];

        //how to print an Array on the console
        System.out.println(sixthGraders);//[Ljava.lang.String;@6d03e736 ==> reference of Array
        //this syntax gives the address of the array
        //we need the array elements mostly to store mutiple data in the same container
        //to be able to see the elements of an array we use the following syntax
        System.out.println(Arrays.toString(sixthGraders));//[null, null, null, null, null]

        //how to add elements into an array

        sixthGraders[0] = "Tom";
        sixthGraders[1] = "Ali";
        sixthGraders[2] = "Jim";
        sixthGraders[3] = "Mark";
        sixthGraders[4] = "Angie";

        System.out.println(Arrays.toString(sixthGraders));//[Tom, Ali, Jim, Mark, Angie]

        //how to print a specific element from an array

        System.out.println(sixthGraders[1]);//Ali

        //for elements
        System.out.println(sixthGraders[0] + " - " + sixthGraders[4]);//Tom - Angie

        //how to find the number of elements in an array

        int numOfElements = sixthGraders.length;// ==> returns total number of the characters
        System.out.println(numOfElements);//5

        //example 1: create a string array  add 5 elements in it, type code to print
        //           the sum of the characters in the first and the last element on the console.
        //           Make your code dynamic

        //hard coding is to reach out just one solution reverse to dynamic code

        String cities[] = new String[5];
        cities[0] = "Miami";
        cities[1] = "New York";
        cities[2] = "Istanbul";
        cities[3] = "berlin";
        cities[4] = "Frankfurt";

        int numOfCharsInFirstIndex = cities[0].length();
        //arrayName[0] ==> will always return the first element in an array
        int numOfCharsInLastIndex = cities[cities.length-1].length();
        //by typing our coding syntax that works for every single array's last index element
        //we need to type our code in dynamic way. when we type "cities.length-1"
        //we can always get the last index of an array
        System.out.println(numOfCharsInFirstIndex + numOfCharsInLastIndex);


        //Example 2: Create a String Array, add 5 elements in it, type code to print
        //           the sum of all characters in all element on the console.

        String names[] = new String[5];
        names[0] = "Brad Pitt";
        names[1] = "Cuneyt Arkin";
        names[2] = "Ajda Pekkan";
        names[3] = "Angelina Jolie";
        names[4] = "Sylvester Stallone";

        //1. way: using for loop
        int sum = 0;
        for (int i = 0; i<names.length;i++){
            sum = sum + names[i].length();
        }
        System.out.println(sum);

        //2. way: using for each loop (enhanced loop)

        int total = 0;
        for(String w: names){//has the same functionality with these sections ==> (int i = 0; i<names.length;i++)
           total = total + w.length();
        }
        System.out.println(total);

    /*
        note 1: for-each loop can be used with "arrays" and "collections", if there is no arrays collections
        you cannot use for-each loop, you have to use for loop, while loop or do-while loop

       nore 2: sometimes for-each loop cannot be used with arrays and collection as well,
       when using indexes is a must, using for-each loop is impossible
   */






    }
}














