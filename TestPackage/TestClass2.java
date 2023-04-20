package TestPackage;

public class TestClass2 {
    public static void main(String[] args) {
        System.out.println(power(2,-5));

    }

    public static double power(double base , int exp){
        double result = 1;
        if(exp == 0)
            return 1;

        int absExp = Math.abs(exp);

        for(int i = 1 ; i <= absExp ; i++){
            result = result*base;
        }

        if(exp < 0 )
            return 1/result;

        return result;

    }

}
