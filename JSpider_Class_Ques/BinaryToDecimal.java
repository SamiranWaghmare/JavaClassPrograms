package JSpider_Class_Ques;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int n = 1001;
        int count = 0;
        int sum = 0;

        while(n != 0){
            int d = n%10;
            sum  = sum + d*(int)Math.pow(2,count) ;
            n = n/10 ;
            count++;
        }
        System.out.println(sum);
    }
}
