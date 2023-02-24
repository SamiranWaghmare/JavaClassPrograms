package Arrays2d;

public class SpiralAntiClockwise {
    public static void main(String[] args) {
        int[][] a =  {{1,12,11,10,9},{2,13,14,15,8},{3,4,5,6,7}};
        printAntiSpiral(a);
    }

    public static void printAntiSpiral(int a[][]){
         int top = 0, bottom = a.length-1 , left = 0 , right = a[0].length-1;
         int dir = 1;

         while(top <= bottom && left <= right ){
             if(dir == 1){
                 for(int i = top ; i <= bottom ; i++){
                     System.out.print(a[i][left] + " ");
                 }
                 dir = 2;
                 left++;
             }else if(dir == 2){
                 for(int i = left ; i <= right; i++){
                     System.out.print(a[bottom][i] + " ");
                 }
                 dir = 3;
                 bottom--;
             }else if(dir == 3){
                 for(int i = bottom ; i >= top ; i--){
                     System.out.print(a[i][right] + " ");
                 }
                 dir = 4;
                 right--;
             }else if(dir == 4){
                 for(int i = right ; i >= left; i--){
                     System.out.print(a[top][i] + " ");
                 }
                 dir = 1;
                 top++;
             }
         }
    }
}

