package NumberTheory;

import java.util.Scanner;

public class StrongNum {
    static int count = 0;
    public static void main(String[] args) {
        count ++;
      for(int i = 1; i<=1000 ; i++){
          if(isStrong(i)){
              System.out.println(i);
          }
      }
        System.out.println(count);
    }

    public static boolean isStrong(int n){
        int sum = 0,temp = n;
        while(n!=0){
            int d = n%10;
            int f = fact(d);
            sum = sum + f;
            n = n/10;
        }
        count++;
        return sum == temp;
    }
    public static int fact(int n){
        int p = 1;
        while(n > 1){
            p = p * n;
            n--;
        }
        count++;
        return p ;
    }
}
