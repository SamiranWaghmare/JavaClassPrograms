package Part3;

public class TwoDigitNumberCount {
    public static void main(String[] args) {
        int[] a = Arrays.readArray();
        Arrays.displayArray(a);
        int count = 0;
        for(int i = 0; i < a.length ; i++){
            if((a[i] > -100 && a[i] < -9) || (a[i] > 9 && a[i] < 100))
                count++;
        }
        System.out.println("there are " + count +" double digit numbers int this array");
    }
}
