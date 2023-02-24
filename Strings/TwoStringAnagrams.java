package Strings;

public class TwoStringAnagrams {
    public static void main(String[] args) {
        String s1 = "state";
        String s2 = "taste";
        System.out.println(isAnagram(s1,s2));

    }

    public static boolean isAnagram(String s1, String s2){
        int[] a = new int[128];

        for(int i = 0 ; i < s1.length() ; i++){
            a[s1.charAt(i)]++;
        }
        for(int i = 0 ; i < s2.length() ; i++){
            a[s2.charAt(i)]--;
        }
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] != 0)
                return false;
        }
        return true;
    }
}
