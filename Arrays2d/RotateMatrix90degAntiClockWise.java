package Arrays2d;

import Part3.Arrays;

public class RotateMatrix90degAntiClockWise {
    public static void main(String[] args) {
        int[][] a = Arrays.readMatrix();
        Arrays.displayMatrix(a);
        System.out.println("The matrix roted anti-clockwise is as follows");
        Arrays.displayMatrix(rotate90ac(a));
    }

    public static int[][] rotate90ac(int[][] a){
        a = ReverseEachColumnOfMatrix.reverseColumns(TransposeAmatrix.TransposeMatrix(a));
        return a;
    }
}
