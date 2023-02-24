package NumberTheory;

import java.util.Scanner;

public class NumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numOfDigits(n));

    }

    public static int numOfDigits(int n){
        int count = 0;
        do{
            n = n/10;
            count++;
        }while(n !=0);
        return count;
    }
}
