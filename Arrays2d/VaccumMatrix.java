package Arrays2d;

import Part3.Arrays;

import java.util.Scanner;

public class VaccumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number matrix : ");
        int n = sc.nextInt();
        Arrays.displayMatrix(spiralclock(n));
    }


    public static int [][] spiralclock(int n){
        int a[][]=new  int[n*2-1][n*2-1];
        int p = n;

        for(int i=0,j=a.length-1;i<j;i++,j--){

            for(int k=i;k<j;k++){
                a[i][k]=p;
            }
            for(int k=i;k<j;k++){
                a[k][j]=p;
            }
            for(int k=j;k>i;k--){
                a[j][k]=p;
            }
            for(int k=j;k>i;k--){
                a[k][i]=p;
            }
            p--;
        }
        if(a.length%2!=0){

            a[a.length/2][a.length/2]=p;
        }
        return a;

    }
}
