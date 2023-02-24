package Arrays2d;

import Part3.Arrays;

public class OddEvenSumDifference {
    public static void main(String[] args) {
        int[][] a = Arrays.readMatrix();
        Arrays.displayMatrix(a);
        System.out.println(oddEvnDifference(a));

    }

    public static int oddEvnDifference(int[][] a){
        int oddSum = 0,evenSum = 0;
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ;j++){
                if(a[i][j]%2 == 1)
                    oddSum = oddSum + a[i][j];
                else
                    evenSum = evenSum + a[i][j];
            }
        }
        return oddSum>evenSum ? oddSum-evenSum : evenSum-oddSum;
    }
}
