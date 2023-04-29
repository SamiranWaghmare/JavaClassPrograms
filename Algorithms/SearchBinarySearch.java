package Algorithms;

import Part3.Arrays;

import java.util.Scanner;

public class SearchBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,9,23,34,58,98,104,483,563,823};
        System.out.println("Enter the element you want to get index of :");
        int element = sc.nextInt();
        Arrays.displayArray(arr);
        System.out.println("the index of the element is " + BinarySort(arr,element));
    }
    public static int BinarySort(int[] arr, int element){
        int low = 0;
        int high = arr.length - 1;

        for(int i = 0 ; i < arr.length ; i++){
            int mid = (low+high)/2;
            if (arr[mid] > element)
                high = mid-1;
            else if(arr[mid] < element)
                low = mid+1;
            else
                return mid;
        }
        return - 1;
    }
}
