package Part3;
import java.util.Scanner;
public class Arrays {
    public static int[] readArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your array :");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for(int i = 0 ; i < a.length ; i++ ){
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void displayArray(int a[]){
        for ( int i = 0 ; i < a.length ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    //this method reads a 2d matrix array from user
    public static int[][] readMatrix(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns");
        int columns = sc.nextInt();

        int[][] a = new int[rows][columns];
        System.out.println("Enter the values now");
        for(int i = 0 ; i < a.length ; i++){
            System.out.println("Enter values at row " + (i+1));
            for(int j = 0 ; j < a[i].length ; j++){
                a[i][j] = sc.nextInt();
            }
        }
        return a;
    }

    //method to display a matrix/2d array
    public static void displayMatrix(int[][] a){
        for(int i = 0; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
