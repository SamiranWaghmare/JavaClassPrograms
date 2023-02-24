package JSpider_Class_Ques;
// 0
// 0 1
// 0 1 0
// 0 1 0 1
// 0 1 0 1 0 for size = 5. WAP for size = n;
public class Pattern4 {
    public static void main(String[] args) {
        int size = 5;
        for(int row = 0 ; row < size ; row++){
            for(int col =0; col <= row ; col++){
                System.out.print(col%2 + " ");
            }
            System.out.println();
        }
    }
}
