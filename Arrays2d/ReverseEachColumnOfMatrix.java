package Arrays2d;

import Part3.Arrays;

public class ReverseEachColumnOfMatrix {
    public static void main(String[] args) {
        int[][] a = Arrays.readMatrix();
        Arrays.displayMatrix(a);
        reverseColumns(a);
        System.out.println("The matrix with reversed columns is as follows");
        Arrays.displayMatrix(a);
    }

    public static int[][] reverseColumns(int[][] a){
        for(int i = 0 ; i < a[0].length ; i++){
            for(int j = 0 ; j < a.length/2 ; j++){
                int temp = a[j][i];
                a[j][i] = a[a.length-1-j][i];
                a[a.length-1-j][i] = temp;
            }
        }
        return a;
    }
}
