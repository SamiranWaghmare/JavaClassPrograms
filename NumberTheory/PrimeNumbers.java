package NumberTheory;

public class PrimeNumbers {
    public static void main(String[] args) {

        System.out.println(isPrime(5));

    }
    public static boolean isPrime(int n){
        if(n==1)
            return false;

        for(int i = 2 ; i <= n/2 ; i++){
            if(n%i == 0)
                return false;
        }
        return true ;
    }
}
