package Strings;

public class CheckIfVovelIsPresent {
    public static void main(String[] args) {
        System.out.println(isVovel("smrnx"));
    }
    public static boolean isVovel(String s){
        String vovels = "aeiou";
        s = s.toLowerCase();
        for(int i = 0 ; i < vovels.length() ; i++){
            if(s.indexOf(vovels.charAt(i)) > 0)
                return true;

        }
        return false;

    }
}
