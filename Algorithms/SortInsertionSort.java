package Algorithms;

import java.util.Arrays;
import java.util.Random;

public class SortInsertionSort {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[10];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = random.nextInt(100);
        }
        System.out.println("Before :");
        printArray(arr);
        InsertionSort(arr);
        System.out.println("After :");
        printArray(arr);
    }

    public static void InsertionSort(int[] arr){
        for(int  i = 1 ; i < arr.length ; i++){
            int currentValue = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > currentValue){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = currentValue;
        }
    }

    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.println(i);
        }
    }
}
