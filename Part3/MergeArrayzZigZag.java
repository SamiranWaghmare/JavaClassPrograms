package Part3;

public class MergeArrayzZigZag {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {5,6,7,8};
        int[] c = mergeZigZag(a,b);
        Arrays.displayArray(c);
    }

    public static int[] mergeZigZag(int[] a , int[] b){
        int i = 0, j = 0 ;
        int[] c = new int[a.length+b.length ];
        int n = a.length<b.length ? a.length : b.length;

        while(i < n){
            c[j] = a[i];
            j++;
            c[j] = b[i];
            i++; j++;
        }
        while(i < a.length){
            c[j] = a[i];
            i++ ; j++ ;
        }
        while(i < b.length){
            c[j] = b[i];
            i++ ; j++;
        }
        return c;
    }
}
