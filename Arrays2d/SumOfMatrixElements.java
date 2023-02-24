package Arrays2d;

import Part3.Arrays;

public class SumOfMatrixElements {
    public static void main(String[] args) {
            int[][] a = Part3.Arrays.readMatrix();
            Arrays.displayMatrix(a);
            System.out.println(returnSum(a));;
       }

    public static int returnSum(int[][] a){
        int sum = 0 ;
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                sum = sum + a[i][j];
            }
        }
        return sum;
    }
}
