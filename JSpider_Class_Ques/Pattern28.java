package JSpider_Class_Ques;

public class Pattern28 {
    public static void main(String[] args) {
        int n = 5 ;
        int sp = n-1;

        for(int i = n ; i >= 1 ; i--){
            for(int j = 1 ; j <= sp; j++){
                System.out.print("  ");
            }
            for(int j = i ; j<=n ; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            sp--;
        }
    }
}
