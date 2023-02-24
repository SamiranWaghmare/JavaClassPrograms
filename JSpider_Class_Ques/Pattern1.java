package JSpider_Class_Ques;

//* * * * *
//* * * * *
//* * * * *
//* * * * *    example of n=5 star square
//* * * * *  make pattern of n stars square

public class Pattern1 {
    public static void main(String[] args) {
        int size = 5;
        for(int row = 0 ; row < size ; row++){
            for(int col = 0 ; col < size ; col++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
