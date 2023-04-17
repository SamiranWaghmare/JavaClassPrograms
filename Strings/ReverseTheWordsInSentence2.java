package Strings;

public class ReverseTheWordsInSentence2 {
    public static void main(String[] args) {
        String s = "this is a very pleasant day to get fucked";
        String[] arr = s.split(" ");
        StringBuilder reversedSentence= new StringBuilder();

        for( String word : arr)
        {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedSentence.append(reversedWord.reverse());
            reversedSentence.append(" ");
        }

        s = reversedSentence.toString();
        s = s.trim();
        System.out.println(s);

    }
}
