package TestPackage;

public class TestClass2 {
    public static void main(String[] args) {
    String s = "This is Sparta";

    char[] ca = s.toCharArray();
    int first = 0;

    for(int i = 0 ; i < s.length() ; i++){
        if(i==0 && ca[i] != ' ' || ca[i] != ' ' && ca[i-1] == ' ' ){
            first = i;
        }
        if(i==s.length()-1 && ca[i] != ' ' || ca[i] != ' ' && ca[i+1] == ' '){
            char temp = ca[first];
            ca[first] = ca[i];
            ca[i] = temp;
        }
    }

        System.out.println(ca);

    }
}
