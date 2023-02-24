package Strings;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        String s = "Sami@1234";
        System.out.println(digitSum(s));
    }

    public static int digitSum(String s){
        char[] c = s.toCharArray();
        int sum = 0;
        for(int i = 0 ; i < c.length ; i++){
            if(c[i] >= '0' && c[i] <= '9')
                sum = sum + (int)c[i]-48;
        }
        return sum;
    }

}
