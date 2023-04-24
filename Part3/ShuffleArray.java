package Part3;

import java.util.Arrays;
import java.util.Collections;

public class ShuffleArray {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        shuffleArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shuffleArray(Integer[] arr){

        Collections.shuffle(Arrays.asList(arr));
    }
}
