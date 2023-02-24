package Arrays2d;

import Part3.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[][] a = Arrays.readMatrix();
        Arrays.displayMatrix(a);
        System.out.println("largest element is " + returnLargestElement(a));
    }

    public static int returnLargestElement(int[][] a){
        int largest = a[0][0];
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                if(largest < a[i][j])
                    largest = a[i][j];
            }
        }
        return largest;
    }
}
