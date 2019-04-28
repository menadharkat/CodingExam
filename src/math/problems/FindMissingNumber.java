package math.problems;


public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};


        int expectedValue = expectation(10);
        findMissingNum(array,expectedValue);
    }
    public static int findMissingNum (int [] array, int expectedValue) {
        int missingNum;
        int m = 0;
        for (int n : array) {
            m += n;
        }
        missingNum= expectedValue-m;
        System.out.println(" Missing number is: " + missingNum);
        return missingNum;
    }
    public static int expectation (int n ){
        int m= 0;
        int [] array = new int [n]; // create an array of size
        for (int i = 0; i <array.length; i++){
            array[i] = i +1;
        }
        for (int s :array ){
            m +=s;
        }
        System.out.println(" array>L is: " + m);
        return m;


    }
}
