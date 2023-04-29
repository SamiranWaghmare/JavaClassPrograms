package TestPackage;

import java.util.Arrays;

public class TestClass2 {
    public static void main(String[] args) {
        String  s = "Hello world";
        System.out.println("The string " + s + " has " + unique(s) + " unique chars" );

    }

    public static int unique(String s){
        int count = 0;
        boolean[] elements = new boolean[128];
        s = s.toLowerCase();

        for(int i = 0 ; i < s.length() ; i++){
            elements[(int)s.charAt(i)] = true;
        }

        for(int i = 0 ; i < elements.length; i++){
            if(elements[i])
                count++;
        }

        return count;
    }


}
