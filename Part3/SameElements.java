package Part3;

import java.util.Arrays;

//check if two array has same elements
public class SameElements {

    public static void main(String[] args) {
        int[] a1 = {1,3,5,2};
        int[] a2 = {3,1,2,5};
        System.out.println(hasSameElements(a1,a2));
    }

    public static boolean hasSameElements(int[] a1 ,int[] a2){
        if(a1.length != a2.length)
            return false;

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1,a2);
    }
}
