package Arrays2d;

public class VaccumMatrix2 {
    public static void main(String[] args) {
        int n = 3;

        for(int i = 1; i <= 2*n-1; i++){
            for(int j = 1; j <= 2*n-1; j++){
                int min = Math.min(Math.min(i, j), Math.min(2*n-i, 2*n-j));
                System.out.print(n-min+1 + " ");
            }
            System.out.println();
        }
    }

}
