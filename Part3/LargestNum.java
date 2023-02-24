package Part3;

public class LargestNum {
    public static void main(String[] args) {
        int[] a = Arrays.readArray();
        Arrays.displayArray(a);
        int L = a[0];

        for(int i = 1 ; i < a.length ; i++){
            if(a[i] > L)
                L = a[i];
        }
        System.out.println(L + " Is the largest number from this array");
    }
}
