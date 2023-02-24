package Strings;

import java.util.Scanner;

public class NumberOfWordsInaSentence {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        int fl = 0, ll = 0;

        for( int i = 0 ; i < c.length ; i++){
            if(i == 0 && c[i] != ' '  || c[i] != ' ' && c[i - 1] == ' '){
                fl++;
                System.out.println(c[i]+ " ");
            }
        }
        for( int i = 0 ; i < c.length ; i++){
            if(i == c.length-1 && c[i] != ' '  || c[i] != ' ' && c[i + 1] == ' '){
                ll++;
                System.out.println(c[i]+ " ");
            }
        }
        System.out.println(ll);
    }
}
