package Arrays2d;

import Part3.Arrays;

public class SumOfRowsInMatrix {
    public static void main(String[] args) {
        int[][] a = Arrays.readMatrix();
        Arrays.displayMatrix(a);
        System.out.println("Sum of the rows of the given matrix are ");
        Arrays.displayArray(returnSum(a));

    }

    public static int[] returnSum(int[][] a){
        int[] b = new int[a.length];
        for(int i = 0 ; i < a.length; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                b[i] = b[i] + a[i][j];
            }
        }
        return b;
    }
}
