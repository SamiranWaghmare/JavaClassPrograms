package JSpider_Class_Ques;

public class Pattern19alt {
    public static void main(String[] args) {
        int n = 5;
        int sp = n-1;
        int st = 1;

        for(int i = 1; i <=n ; i++){
            for(int j=1 ; j<=sp ;j++){
                System.out.print("  ");
            }
            for(int j =1 ; j<= st; j++){
                System.out.print("* ");
            }
            System.out.println();
            sp--;
            st= st + 2 ;
        }
    }
}
