package Strings;

public class FrequencyOfCharactersIntArray {
    public static void main(String[] args) {
        String s = "Hello  Hie";
        count(s);

    }

    public static void count(String s ){
        char[] ca = s.toCharArray();
        int[] a = new int[128];
        for(int i = 0 ; i < ca.length ; i++){
//            char c = s.charAt(i);
            a[ca[i]]++;
        }
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] != 0)
                System.out.println((char)i + " is present " + a[i] + " times");
        }
    }
}
