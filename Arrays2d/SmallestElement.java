package Arrays2d;

import Part3.Arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int[][] a = Arrays.readMatrix();
        Arrays.displayMatrix(a);
        System.out.println("Smallest element is " + returnSmallestElement(a));
    }

    public static int returnSmallestElement(int[][] a){
        int smallest = a[0][0];
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                if(smallest > a[i][j])
                    smallest = a[i][j];
            }
        }
        return smallest;
    }
}
