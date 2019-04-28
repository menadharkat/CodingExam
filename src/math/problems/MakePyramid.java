package math.problems;

public class MakePyramid {
    public static void main(String[] args) {


        /*   Implement a large Pyramid of stars in the screen with java.
//          /*
                    *
                   * *
                  * * *
                 * * * *
                * * * * *
               * * * * * *

        */

        for(int i=1;i<=6;i++){
            for(int A=6;A>=i;A--){
                System.out.print(" ");
            }
            for(int B=1 ;B<=i;B++) {
                System.out.print(" *");
            }
            System.out.println("");
        }





    }
}

