package Part3;

public class Array2dTest {
    public static void main(String[] args) {
        int[][] a = new int[4][];
        a[0] = new int [2];
        a[1] = new int [3];
        a[2] = new int [3];
        a[3] = new int [1];

        System.out.println(a.length);//prints length of 2d array a
        //prints lenghts of int arrays inside a
        for(int i = 0 ; i < a.length; i++){
            System.out.println(a[i].length);
        }


    }
}
