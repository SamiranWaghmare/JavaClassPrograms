package Strings;

public class FrequencyOfCharactersUppercasd{
    public static void main(String[] args) {
        String s = "okay boss";
        s = s.toUpperCase();

        int[] a = new int[26];
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            a[c - 65]++;
        }
        for(int i = 0; i < a.length ; i++){
            if(a[i] != 0)
                System.out.println((char)(i+65) + " has frequency of " + a[i]);
        }
    }
}
