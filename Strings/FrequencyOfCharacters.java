package Strings;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String s = "nitin";
        char[] c = s.toCharArray();
        System.out.println(s);
        frequency(c);
    }

    public static void frequency(char[] c){
        boolean[] b = new boolean[c.length];

        for(int i = 0 ; i < c.length ; i++){
            int count = 1;
            if(!b[i]){
                for(int j = i + 1 ; j < c.length ; j++){
                    if(c[i] == c[j]){
                        count++;
                        b[j] = true;
                    }
                }
                System.out.println(c[i] + " has frequency of " + count);
            }
        }
    }


}
