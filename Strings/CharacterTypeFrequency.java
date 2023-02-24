package Strings;

public class CharacterTypeFrequency {
    public static void main(String[] args) {
        String s = "sam@1234";
        frequencies(s);
    }

    public static void frequencies(String s){
        int spCharCount = 0 , digitCount = 0 , alphabetCount = 0;
        char[] c = s.toCharArray();

        for(int i = 0 ; i < c.length ; i++){
            if( c[i] >= '0' && c[i] <= '9'){
                digitCount++;
            } else if ((c[i] >= 'a' && c[i] <= 'z') || (c[i] >= 'A' && (c[i] <= 'Z'))) {
                alphabetCount++;
            }else{
                spCharCount++;
            }
        }
        System.out.println("Digit count is " + digitCount);
        System.out.println("Alphabet count is " + alphabetCount);
        System.out.println( "Special Character count is " + spCharCount);
    }
}
