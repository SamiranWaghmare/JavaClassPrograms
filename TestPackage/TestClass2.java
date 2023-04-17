package TestPackage;

public class TestClass2 {
    public static void main(String[] args) {
    String s = "sam1234sam";
    StringBuffer sb = new StringBuffer();

    //to get the number out of a string
        for(int i = 0 ; i < s.length(); i++){
            if((s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                sb.append(s.charAt(i));
            }
        }

        int num = Integer.parseInt(sb.toString());
        System.out.println(num);

    }
}
