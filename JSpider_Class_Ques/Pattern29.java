package JSpider_Class_Ques;

public class Pattern29 {
    public static void main(String[] args) {
        int n = 5,sp = n-1;
        for (int i = 1; i <= n; i++) {
            for(int j = sp ; j >= 1 ; j--){
                System.out.print("  ");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j+" ");
                if(j != i )
                    System.out.print("* ");
            }
            sp--;
            System.out.println();
        }
    }
}
