package TestPackage;

import java.util.Arrays;

public class TestClass2 {
    public static void main(String[] args) {
        int[] arr = {-1,-4,-3,-2,-434,0};
        shuffle(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void shuffle(int[] arr){

        for(int i = 0 ; i < arr.length ; i++){

            int index = i + (int)(Math.random()*(arr.length-i));
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

}
