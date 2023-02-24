package Part3;

public class ReverseAnArray2 {
    public static void main(String[] args) {
        int[] a = Arrays.readArray();
        Arrays.displayArray(a);
        reverseArray(a);
        Arrays.displayArray(a);

    }

    public static void reverseArray(int[] a){

        for(int i = 0 ; i < a.length/2 ; i++){
            int temp = a[i];
            a[i] = a[a.length-1-i] ;
            a[a.length-1-i] = temp ;

        }
    }
}
