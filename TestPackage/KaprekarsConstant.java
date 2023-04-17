package TestPackage;

import java.util.Arrays;

public class KaprekarsConstant {

    public static void main(String[] args) {
        int num = 8088; // replace with desired four-digit number
        int steps = 0;

        while (num != 6174) {
            int[] arr = new int[4];
            int n = num;

            // store each digit in an array
            for (int i = 0; i < 4; i++) {
                arr[i] = n % 10;
                n /= 10;
            }

            // sort the array in ascending and descending order
            Arrays.sort(arr);
            int asc = arr[0] * 1000 + arr[1] * 100 + arr[2] * 10 + arr[3];
            int desc = arr[3] * 1000 + arr[2] * 100 + arr[1] * 10 + arr[0];

            // perform subtraction and update num
            num = desc - asc;
            steps++;
        }

        System.out.println("Kaprekar's Constant reached after " + steps + " steps.");
    }
}
