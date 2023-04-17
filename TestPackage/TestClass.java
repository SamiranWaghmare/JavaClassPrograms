package TestPackage;

public class TestClass {
    public static void main(String[] args) {
        int[] arr = {2,32,43,53,63,90,123,321,345,535};
        int element = 4434;
        System.out.println("index of the element "+ element +" is " + binarySearch(arr,element));
    }

    public static int binarySearch(int[] arr , int element){
        int low = 0;
        int high = arr.length-1;

        // binary search
        for(int i = 0 ; i < arr.length ; i++){
            int mid = (low+high)/2;
                if(element < arr[mid])
                    high = mid - 1;
                else if (element > arr[mid]) {
                    low = mid + 1;
                }else if(element == arr[mid]){
                    return mid;
                }
            }
        return -1;
    }
}
