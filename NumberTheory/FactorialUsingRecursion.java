package NumberTheory;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println(fact(3));
    }

    public static int fact(int n) {
      if(n == 1)
          return 1;
      else
          return n*fact(n-1);

    }
}