package Strings;

import java.util.Scanner;

public class FirstLetterUppercaseRestLower {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        char c[] = s.toCharArray();

        for( int i = 0 ; i < c.length ; i++){
            if(i == 0 && c[i] != ' '  || c[i] != ' ' && c[i - 1] == ' '){
                c[i] = (char)(c[i]-32);
            }
        }

        System.out.println(new String(c));
    }
}
