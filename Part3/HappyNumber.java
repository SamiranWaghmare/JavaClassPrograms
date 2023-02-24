package Part3;

public class HappyNumber {
    public static void main(String[] args) {

    for(int i = 1 ; i <= 100; i++){
        if(isHappy(i))
            System.out.println(i + " ");
    }

    }
    public static boolean isHappy(int n){
        while(n > 0){
            if(n > 9){
                n = sumSquare(n);
            }else{
                return(n == 1 || n == 7);
            }
        }
        return false;
    }

    public static int sumSquare(int n){
        int sum = 0 ;
        while(n>0){
            sum = sum + (n%10)*(n%10);
            n = n/10;
        }
        return sum;
    }
}
