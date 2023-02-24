package Part3;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4};
        int[] a2 = {5,6,7};
        Arrays.displayArray(mergeArray(a1,a2));
    }
    public static int[] mergeArray(int[] a,int[] b){
        int[] a3 = new int[a.length + b.length];
        int i = 0 ;
        while(i < a.length){
            a3[i] = a[i];
            i++;
        }
        int k = 0 ;
        while(i < a3.length){
            a3[i] = b[k];
            i++;
            k++;
        }
        return a3;
    }

}

