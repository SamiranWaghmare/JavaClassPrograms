package Arrays2d;

import Part3.Arrays;

public class SpiralMatrixLowCode {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        Arrays.displayMatrix(a);
        spiralOut(a);
    }

    public static void spiralOut(int[][] a){
        int[] b = new int[a.length * a[0].length];

        for(int i = 0 , j = a.length-1 ; i < j ; i++ , j--){
            for(int k = i ; k < j ; k++){
                System.out.print(a[i][k] + " ");
            }
            for(int k = i ; k < j ; k++){
                System.out.print(a[k][j] + " ");
            }
            for(int k = j ; k > i ; k--){
                System.out.print(a[j][k] + " ");
            }
            for(int k = j ; k > i ; k--){
                System.out.print(a[k][i] + " ");
            }
        }
        if(a.length%2 != 0)
            System.out.print(a[a.length/2][a.length/2]+ " ");
    }
}

