package Arrays2d;

import Part3.Arrays;

public class RotateMatrix90degClockwise {
    public static void main(String[] args) {
        int[][] a = Arrays.readMatrix();
        Arrays.displayMatrix(a);
        System.out.println("The matrix roted anti-clockwise is as follows");
        Arrays.displayMatrix(rotate90c(a));
    }

    public static int[][] rotate90c(int[][] a){
        a = ReverseEachRowOfMatrix.reverseRows(TransposeAmatrix.TransposeMatrix(a));
        return a;
    }
}

