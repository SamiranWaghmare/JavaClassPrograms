package Arrays2d;

import Part3.Arrays;

public class SumOfColumnsInMatrix {
    public static void main(String[] args) {
        int[][] a = Arrays.readMatrix();
        Arrays.displayMatrix(a);
        System.out.println("sum of the elements of each columns is");
        Arrays.displayArray(returnSum(a));

    }

    public static int[] returnSum(int[][] a){
        int[] b = new int[a[0].length];
        for(int i = 0 ; i < a[0].length ; i++){
            for(int j = 0 ; j < a.length ; j++){
                b[i] = b[i] + a[j][i];
            }
        }
        return b;
    }
}
