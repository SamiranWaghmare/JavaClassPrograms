package NumberTheory;

public class StrongNumber {
    public static void main(String[] args) {
        System.out.println(isStrong(2));
    }

    public static boolean isStrong(int n ){
        int  k = 0,sum = 0,temp = n;
        for(int i=1 ; n>=1 ; i++ ){
            k = n%10 ;
            n = n/10;
            int fac = 1;
            for(int j = k ; j >= 1 ;j-- ){
                fac = fac *= j;
            }
            sum = sum + fac ;
        }

        if(sum == temp){
            return true;
        }
        return false;
    }
}
