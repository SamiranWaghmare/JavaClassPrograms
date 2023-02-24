package NumberTheory;

public class XytemNumber {
    public static void main(String[] args) {
        int n = 611111122;
        if(isXytem(n))
            System.out.println(n + " is a Xytem Number ");
        else
            System.out.println(n + " is a not a Xyetm Number ");
    }
    public static boolean isXytem(int n){
        int lastDigit = n%10 ,sumFL = 0 ,sumMiddle = 0;
        n = n/10;

        while( n != 0){
            if(n>9){
                sumMiddle += n%10;
                n = n/10;
            }else{
                sumFL = n + lastDigit;
                n = n/10;
            }
        }
        return sumMiddle == sumFL;
    }
}
