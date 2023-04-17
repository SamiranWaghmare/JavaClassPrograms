package NumberTheory;

public class PerfectNoUsingRecursion {
    public static void main(String[] args) {
        int sum = 0, i = 1 ;
        int n = 6;
        if(isPerfect(n,i,sum))
            System.out.println("is Perfect");
        else
            System.out.println("not Perfect");

    }

    public static boolean isPerfect(int n, int i , int sum){
        if(i <= n/2) {
            if (n % i == 0) {
                sum = sum + i;
            }
            System.out.println(n + " " + i + " " + sum);
            return isPerfect(n,++i,sum);
        }
        return sum == n;
    }
}
