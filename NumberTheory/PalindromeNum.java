package NumberTheory;

public class PalindromeNum {
    public static void main(String[] args) {
        for(int i = 100 ; i <= 999 ; i++){
            if(isPalindrome(i))
                System.out.println(i);
        }


    }
    public static boolean isPalindrome(int n){
        int rN = 0;
        if(n%10 == 0)
            return false;

        while(n > rN){
            rN = rN * 10 + (n%10);
            n = n/10;
        }
        if( n == rN || n == rN/10)
            return true;
        return false;
    }

}
