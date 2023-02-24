package NumberTheory;

public class PascalTriangle {

    public static void main(String[] args) {
        printPascalTri(6);
    }

    public static void printPascalTri(int size) { //define your function
        int[][] pasT = new int[size][size];
        int row, col;

        for (row = 0; row < size; row++) {
            for (col = 0; col <= row; col++) {

                if (col == 0 || row == col) {
                    pasT[row][col] = 1;
                }else {
                    pasT[row][col] = pasT[row - 1][col - 1] + pasT[row - 1][col];
                }
            }
        }

        for (row = 0; row < size; row++) {
            for (col = 0; col <= row; col++) {
                System.out.print(pasT[row][col] + " ");
            }
            System.out.println();
        }
    }
}
