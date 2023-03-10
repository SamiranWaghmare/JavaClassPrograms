package NumberTheory;

public class PerfectNumber {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 1000 ; i++){
            if(isPerfect(i))
                System.out.println(i);
        }
    }

    public static boolean isPerfect(int n){
        int sum = 0;
        for(int i = 1 ; i <= n/2 ; i++){
            if(n%i == 0){
                sum = sum + i;
            }
        }
        return sum == n;
    }
}
