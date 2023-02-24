package JSpider_Class_Ques;

public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;
        int sp = n-1;

        for( int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n ; j++){

                if(j<=sp) {
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
            sp--;
        }

    }
}
