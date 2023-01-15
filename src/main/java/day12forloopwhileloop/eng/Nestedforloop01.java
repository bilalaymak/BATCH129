package day12forloopwhileloop.eng;

public class Nestedforloop01 {
    public static void main(String[] args) {

        /*
           type code to get the output like
           1
           12
           123
           1234
           12345
        */
        int numOfRows = 5;
        for (int i = 1; i <= numOfRows; i++){
            for (int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }



    }
}
