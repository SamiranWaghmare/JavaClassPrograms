package Strings;

public class TwoStringAnagramsWorking {
    public static void main(String[] args) {
        String s1 = "State";
        String s2 = "Taste";
        System.out.println(isAnagram(s1,s2));

    }
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int a[] = new int[26];
        for(int i = 0; i < s1.length() ; i++){
            char c = s1.charAt(i);
            a[c-97]++;
        }
        for (int i = 0 ; i < s2.length() ; i++) {
            char c = s2.charAt(i);
            a[c - 97]--;
        }
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] != 0) {
                return false;
            }
        }
        return true;


    }
}
