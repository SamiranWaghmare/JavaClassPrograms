package JSpider_Class_Ques;

public class Fibonacci {
    public static void main(String[] args) {
        printFibonacci(6);
    }

    public static void printFibonacci(int n){
        int num = n ;
        int a = 0;
        int b = 1;
        int sum = 0;

        for(int i = 1 ; i <= n ; i++){
            System.out.println(sum);
            a = b;
            b = sum;
            sum = a+b ;
        }

    }
}
