package Arrays2d;

import Part3.Arrays;

public class SumOfTwoMatrix {
    public static void main(String[] args) {
        int[][] a = Arrays.readMatrix();
        int[][] b = Arrays.readMatrix();
        Arrays.displayMatrix(a);
        Arrays.displayMatrix(b);
        if(a.length != b.length || a[0].length != b[0].length) {
            System.out.println("invalid matrix dimensions");
            return;
        }
        System.out.println("sum of the arrays above is ");
        Arrays.displayMatrix(add2Matrix(a,b));

    }
    public static int[][] add2Matrix(int[][] a,int[][] b){
        int[][] c = new int[a.length][b.length];
        for(int i = 0 ; i < a.length ; i++){

            for(int j = 0 ; j < a[i].length ; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
}
