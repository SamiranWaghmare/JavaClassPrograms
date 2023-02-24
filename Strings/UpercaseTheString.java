package Strings;

public class UpercaseTheString {
    public static void main(String[] args) {
        String s = "saMIraN" ;
        System.out.println(toUpperCase(s));

    }

    public static String toUpperCase(String s){
        char[] c = s.toCharArray();
        for(int i = 0 ; i < c.length ; i++){
            if(c[i] >= 'a' && c[i] <= 'z'){
                c[i] = (char) (c[i] - 32);
            }
        }
        s = String.valueOf(c);
        return s ;

    }
}
