package NumberTheory;

import java.util.Scanner;

public class AbsoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if(n<0){
            n = -(n);
        }
        System.out.println("absolute value is " + n);
    }
}
