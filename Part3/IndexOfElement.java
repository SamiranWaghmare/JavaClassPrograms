package Part3;

import java.util.Scanner;

public class IndexOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a =  Arrays.readArray();
        System.out.println("Enter the element you want to get the index of");
        int n = sc.nextInt();
        int index = returnIndex(a,n);
        System.out.println(" index of the element is " + index);
    }
    public static int returnIndex(int a[],int n){
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] == n) {
                return i;
            }
        }
        return -1;
    }
}

