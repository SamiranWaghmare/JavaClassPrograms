package Part3;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {-1,-4,-3,-2,-434,0};
        int max = arr[0];
        int min = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(max < arr[i])
                max = arr[i];
            if(min > arr[i])
                min = arr[i];
        }
        int secondMax = min;
        for(int i = 0 ; i < arr.length ; i++){
            if( secondMax < arr[i] && arr[i] != max)
                secondMax = arr[i];
        }
        System.out.println("Second Largest element is " + secondMax);
    }
}
