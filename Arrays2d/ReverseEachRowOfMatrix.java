package Arrays2d;

import Part3.Arrays;

public class ReverseEachRowOfMatrix {
    public static void main(String[] args) {
        int[][] a = Arrays.readMatrix();
        Arrays.displayMatrix(a);
        System.out.println("The matrix with reversed rows is as follows");
        Arrays.displayMatrix(reverseRows(a));

    }

    public static int[][] reverseRows(int[][] a){
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length/2 ; j++){
                int temp = a[i][j];
                a[i][j] = a[i][a[i].length-1-j];
                a[i][a[i].length-1-j] = temp;
            }
        }
        return a;
    }

}
