package day16multidimentionalarrays;

public class Star {

    public static void main(String[] args) {

        /*
            Asagidaki sekli cizen kodu yaziniz
                                *
                               * *
                              *   *
                             *     *
                            * * * * *
         */
        int row = 5;

        for(int i=1; i<=row; i++){

            for(int k=i; k<row; k++){
                System.out.print(" ");
            }

            for(int m=1; m<=2*i-1; m++){

                if(i==row || m==1 || m==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}