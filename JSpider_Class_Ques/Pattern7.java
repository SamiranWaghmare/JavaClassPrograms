package JSpider_Class_Ques;

public class Pattern7 {
    public static void main(String[] args) {
        int size = 5;
        for(int row = 1 ; row <= size ; row++){
            for(int col = 1 ; col <= size ; col++){
                System.out.print((row+col)%2 + " ");
            }
            System.out.println();
        }
    }
}
