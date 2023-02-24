package JSpider_Class_Ques;

public class Pattern21 {
    public static void main(String[] args) {
        int n = 5;
        int sp = 0 ;
        int st = n*2-1;

        for( int i = 1; i<=n ; i++){
            for(int j = 1; j<=sp ; j++){
                System.out.print("  ");
            }

            for(int j = 1; j<=st ; j++){
                System.out.print("* ");
            }
            System.out.println();
            sp++;
            st -= 2;
        }
    }
}
