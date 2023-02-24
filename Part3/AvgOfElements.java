package Part3;

public class AvgOfElements {
    public static void main(String[] args) {
        int[] a = Arrays.readArray();
        Arrays.displayArray(a);
        int sum = 0;
        for(int i = 0; i < a.length ; i++){
            sum = sum + a[i];
        }
        System.out.println("The avrage of the elements in the array is " + (double)sum/a.length);
    }
}
