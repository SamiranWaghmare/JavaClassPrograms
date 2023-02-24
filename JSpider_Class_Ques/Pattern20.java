package JSpider_Class_Ques;

public class Pattern20 {
    public static void main(String[] args) {
        int n = 5;
        int sp = 0;

        for(int i = n ; i > 0 ; i--){
            for(int j=1 ; j<=sp ;j++){
                System.out.print("  ");
            }
            for(int j =1 ; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
            sp++;
        }
    }
}
