package JSpider_Class_Ques;

public class DecimalToBinary {
    public static void main(String[] args) {
        int n = 58;
        String binary = "";
        while (n != 0) {
            binary = n%2 + binary;
            n = n / 2;
        }
        System.out.println(binary);
    }
}


