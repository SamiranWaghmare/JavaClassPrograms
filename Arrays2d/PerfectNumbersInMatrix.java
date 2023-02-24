package Arrays2d;
import NumberTheory.PerfectNumber;
import Part3.Arrays;

public class PerfectNumbersInMatrix {
    public static void main(String[] args) {
        int[][] a = Arrays.readMatrix();
        Arrays.displayMatrix(a);
        System.out.println("there are " + countPerfectNumbers(a) + " Perfect Numbers");
    }

    public static int countPerfectNumbers(int[][] a){
        int count = 0 ;
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                if(PerfectNumber.isPerfect(a[i][j]))
                    count++;
            }
        }
        return count;
    }
}
