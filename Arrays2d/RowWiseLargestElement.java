package Arrays2d;

import Part3.Arrays;

public class RowWiseLargestElement {
    public static void main(String[] args) {
        int[][] a = Arrays.readMatrix();
        Arrays.displayMatrix(a);
        System.out.println("largest element from each element ");
        Arrays.displayArray(returnLargest(a));

    }

    public static int[] returnLargest(int[][] a ){
        int[] b = new int[a.length];
       for(int i = 0 ; i < a.length; i++){
           b[i]=a[i][0];
           for(int j =1 ; j < a[i].length ; j++){
               if(a[i][j] > b[i])
                   b[i] = a[i][j];
           }
       }
        return b;

    }
}
