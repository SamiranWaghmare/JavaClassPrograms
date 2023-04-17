package NumberTheory;

public class Fibonacci {
    public static void main(String[] args) {
      printFibonacci(6);
        }

    public static void printFibonacci(int n){
        int n1 = 0;
        int n2 = 1;
        int sum = 0;

        for(int i = 1; i <= n ; i++){
            System.out.println(sum);
            n1 = n2;
            n2 = sum;
            sum = n1 + n2 ;
        }
    }
}
