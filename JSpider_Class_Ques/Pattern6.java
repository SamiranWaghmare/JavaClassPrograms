package JSpider_Class_Ques;
//1 2 3
//4 5 6
//7 8 9 WAP to print the folling patter for size = n;

public class Pattern6 {
    public static void main(String[] args) {
        int size = 3;
        int inc = 1;
        for(int row = 1; row <= size ; row++ ){
            for(int col = 1 ;col <= size ; col++){
                System.out.print(inc + " ");
                inc++;
            }
            System.out.println();
        }
    }
}
