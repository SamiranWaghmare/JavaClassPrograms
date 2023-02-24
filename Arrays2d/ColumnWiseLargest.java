package Arrays2d;

import Part3.Arrays;

public class ColumnWiseLargest {
    public static void main(String[] args) {
        int[][] a = Arrays.readMatrix();
        Arrays.displayMatrix(a);
        System.out.println("largest element of each column is as follows");
        Arrays.displayArray(returnLargest2(a));
    }

    public static int[] returnLargest2(int[][] a){
        int[] b = new int[a[0].length];
        for(int i = 0 ; i < a[0].length ; i++){
            b[i] = a[0][i];
            for(int j = 1; j < a.length ; j++){
                if(b[i] < a[j][i])
                    b[i] = a[j][i];
            }
        }
        return b;
    }
}
