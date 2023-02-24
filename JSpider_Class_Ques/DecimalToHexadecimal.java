package JSpider_Class_Ques;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        int n = 44;
        String s = "";
        while (n != 0) {
            int k = n%16;
            if(k<10){
              s = k + s;
            }else {
                s = (char)(55+k) + s;
            }
            n =  n%16;
        }
        System.out.println(s);
    }
}
