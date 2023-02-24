package Strings;

import java.util.Scanner;

public class ReverseTheWordsInAsentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence");
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        int j = 0 ;
        StringBuffer sb = new StringBuffer();

        for(int i = 0 ; i < c.length ; i++){
            j = i ;
            while(i<c.length && c[i] != ' '){
                i++;
            }
            for(int k = i - 1 ; k >= j ; k--){
                sb.append(c[k]);
            }
            if(i < c.length){
                sb.append(c[i]);
            }
        }
        String out = sb.toString();
        System.out.println(out);
    }
}
