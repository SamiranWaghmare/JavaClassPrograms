package NumberTheory;

public class avgOfDigits {
    public static void main(String[] args) {
        System.out.println(avgOfDigits(41));
    }

    public static double avgOfDigits(int n){
        int k= 0,i = 0;
        double sum = 0;

        while(n > 0){
           k = n%10;
           n = n/10;
           sum = sum+k ;
           i++;
        }
        return sum/i ;
    }
}
