package Part3;
import java.util.Arrays;
import java.util.Random;

public class ShuffleArrayWithoutMethods {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));
        shuffle(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shuffle(int[] arr){

        for(int i = 0 ; i < arr.length ; i++){

            int index = i + (int)(Math.random() * (arr.length - i)) ;
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }
}
