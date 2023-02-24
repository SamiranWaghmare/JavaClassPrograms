package NumberTheory;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n =  153;
        int temp = n ;

        //finding out digit count
        int digits = 0;
        while(temp != 0){
            temp = temp/10;
            digits++;
        }

        //finding out the sum
        int sum = 0;
        temp = n ;
        int lastDigit = 0;
        for( int j = 0 ; j < digits ; j++) {
            lastDigit = temp%10;
            sum += (int) Math.pow(lastDigit, digits);
            temp = temp/10;
        }
        System.out.println(sum);

        if(sum == n){
            System.out.println(n + " Is an Armstrong number");
        }else{
            System.out.println(n + " Is not an Armstrong number");
        }
    }
}
