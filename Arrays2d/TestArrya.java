package Arrays2d;

import Part3.Arrays;

public class TestArrya {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        Arrays.displayArray(addElement(a,2,56));

    }
    public static int[] addElement (int[] a,int b, int c){
        int[] a1 = new int[a.length+1];
        int i = 0;
        while(i<b) {
            a1[i] = a[i];
            i++;
        }
        a1[i] = c;
        i++;
        while(i<a1.length){
            a1[i] = a[i-1];
            i++;
        }
        return a1;
    }
}
