package NumberTheory;

public class HandsomeNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isHandsome(i))
                System.out.println(i);
        }
    }

    public static boolean isHandsome(int n) {
        int l = n % 10;
        int sum = 0;
        n = n / 10;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return l == sum;

    }
}
