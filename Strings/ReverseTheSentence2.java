package Strings;

public class ReverseTheSentence2 {
    public static void main(String[] args) {
        String s = " This is sparta , Dumbledore said calmly";
        String[] sa = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = sa.length-1 ; i >= 0 ; i--){
            sb.append(sa[i]);
            sb.append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
