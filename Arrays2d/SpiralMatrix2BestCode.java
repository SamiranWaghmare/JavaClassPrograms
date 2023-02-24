package Arrays2d;

public class SpiralMatrix2BestCode {
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};
        printSpiralMatrix(a);

    }

    public static void printSpiralMatrix(int[][] a){
        int top = 0 ,bottom = a.length-1 ,left = 0 ,right = a[0].length-1;
        int dir = 1;

        while(top <= bottom && left <= right){
            if(dir == 1){
                for(int i = top ; i <= right ; i++){
                    System.out.print(a[top][i] + " ");
                }
                top++;
                dir = 2;
            } else if (dir == 2) {
                for(int i = top ; i <= bottom ; i++){
                    System.out.print(a[i][right] + " ");
                }
                right--;
                dir = 3;
            } else if (dir == 3) {
                for(int i = right ; i >= left ; i--){
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
                dir = 4;
            } else if (dir ==  4) {
                for(int i = bottom ; i >= top ; i--){
                    System.out.print(a[i][left] + " ");
                }
                left++;
                dir = 1;
            }
        }
    }

}
