package Strings;

import java.util.Scanner;

public class ReverseTheSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence");
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        int j = 0 ;
        StringBuffer sb = new StringBuffer();

        for(int i = c.length-1 ; i >= 0 ; i--){
            j = i ;
            while(i >= 0 && c[i] != ' '){
                i--;
            }
            for(int k = i + 1 ; k <= j ; k++){
                sb.append(c[k]);
            }
            if(i >= 0 ){
                sb.append(c[i]);
            }
        }
        s = sb.toString();
        System.out.println(sb);
        System.out.println(s);
    }
}
