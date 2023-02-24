package Strings;

public class PanagramSentence {
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over the lazy dog";
        if(isPanagram(s))
            System.out.println("the string is a panagaram");
        else
            System.out.println("The string is not a panagarm");

    }
    public static boolean isPanagram(String s) {
        for (char c = 'a' ; c <= 'z' ; c++) {
            if (s.indexOf(c) == -1)
                return false;
        }
        return true;
    }
}
