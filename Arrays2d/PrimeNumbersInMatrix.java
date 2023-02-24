package Arrays2d;

import Part3.Arrays;
import NumberTheory.PrimeNumbers;

public class PrimeNumbersInMatrix {
    public static void main(String[] args) {
        int[][] a = Arrays.readMatrix();
        Arrays.displayMatrix(a);
        System.out.println(primeNumberCount(a) + " prime numbers are present in the array");

    }

    public static int primeNumberCount(int[][] a){
        int count = 0 ;
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                if(PrimeNumbers.isPrime(a[i][j]))
                    count++;
            }
        }
        return count;
    }
}
