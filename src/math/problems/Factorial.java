package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        // recurssion:
        int n=5,fact=1;

        for(int i=1;i<=n;i++)
        {

            fact=fact*i;
        }

        System.out.println("factoral="+fact);
        System.out.println("==============================================");

        //Iteration:
        int n1 = 5;
        int result = 1;
        for (int i = 1; i <= n1; i++) {
            result = result * i;
        }
        System.out.println("The factorial of 5 is " + result);


    }
}



