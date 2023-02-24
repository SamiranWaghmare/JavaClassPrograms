package Part3;

public class SortArrayBubbleSort {

    public static void main(String[] args) {
            int[] arr = Arrays.readArray();
            Arrays.displayArray(bubbleSort(arr));
    }

    public static int[] bubbleSort(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            boolean b = true;
            for(int j = 0 ; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    b = false;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(b)
                return arr;
        }
        return arr;
    }
}
