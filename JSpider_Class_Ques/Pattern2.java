package JSpider_Class_Ques;
//*
//* *
//* * *
//* * * *    ex. for size = 5  display a pattern
//* * * * *  ... for n number of size

public class Pattern2 {
    public static void main(String[] args) {
        int size = 5;
        for(int row = 0 ; row < size ; row++){
            for(int col = 0 ; col <= row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
