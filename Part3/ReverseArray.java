package Part3;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = Arrays.readArray();
        Arrays.displayArray(a);

        for(int i = a.length-1 ; i >= 0 ; i--){
            System.out.print(a[i] + " ");
        }
    }
}
