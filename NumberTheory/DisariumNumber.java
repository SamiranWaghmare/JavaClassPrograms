package NumberTheory;

public class DisariumNumber {
    public static void main(String[] args) {
        for(int i = 1; i <= 1000 ; i++){
            if(isDisarium(i))
                System.out.println(i);
        }
    }
    public static boolean isDisarium(int n){
        int sum = 0,temp = n;
        int count = count(n);
        for(int i = count ; i >= 1 ; i--){
            int k = n%10;
            sum = sum + (int)Math.pow(k,i);
            n = n/10;
        }
        return sum == temp;
    }

    public static int count(int n){
        int count = 0;
        do{
            n = n/10;
            count++;
        }while(n != 0);
        return count;
    }
}
