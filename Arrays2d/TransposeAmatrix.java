package Arrays2d;

import Part3.Arrays;

public class TransposeAmatrix {
    public static void main(String[] args) {
        int[][] a = Arrays.readMatrix();
        Arrays.displayMatrix(a);
        System.out.println("The transposed matrix is as follows");
        Arrays.displayMatrix(TransposeMatrix(a));
    }

    public static int[][] TransposeMatrix(int[][] a){
        int[][] b = new int[a[0].length][a.length];
                for(int i = 0; i < b.length ; i++){
                    for(int j = 0 ; j < b[0].length ; j++){
                        b[i][j] = a[j][i];
                    }
                }
        return b;
    }

}




