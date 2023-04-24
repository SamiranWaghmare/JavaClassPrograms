package NumberTheory;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2,0));
    }

    public static double power(double base,int exponent){
        double sum = 1;

        int AbsExponent = Math.abs(exponent);
        for(int i = 1 ; i <= AbsExponent ; i++){
            sum = sum*base;
        }

        if(exponent < 0){
            return 1/sum;
        }

        return sum;
    }
}
