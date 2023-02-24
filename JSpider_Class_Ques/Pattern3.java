package JSpider_Class_Ques;
//1
//1 0
//1 0 1
//1 0 1 0
//1 0 1 0 1 for size = 5. WAP for size = n;

public class Pattern3 {
    public static void main(String[] args) {
        int size = 5;
        for(int row = 1 ; row <= size ; row++){
            for(int col =1; col <= row ; col++){
                System.out.print(col%2 + " ");
            }
            System.out.println();
        }
    }
}
