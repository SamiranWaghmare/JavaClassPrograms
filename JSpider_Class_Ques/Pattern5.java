package JSpider_Class_Ques;
//1
//0 0
//1 1 1   WAP for the following pattern of size = n;
//0 0 0 0
//1 1 1 1 1

public class Pattern5 {
    public static void main(String[] args) {
        int size = 5;
        for(int row = 1 ;row <= size ; row++){
            for(int col =1 ; col <= row ; col++){
                System.out.print(row%2 + " ");
            }
            System.out.println();
        }
    }
}
