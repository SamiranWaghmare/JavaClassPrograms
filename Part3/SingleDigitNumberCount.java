package Part3;

public class SingleDigitNumberCount {
    public static void main(String[] args) {
            int[] a = Arrays.readArray();
            Arrays.displayArray(a);
            int count = 0;
            for(int i = 0; i < a.length ; i++){
                if(a[i] > -10 && a[i] < 10)
                    count++;
            }
        System.out.println("there are " + count +" single digit numbers int this array");
    }
}
