package JSpider_Class_Ques;

public class Pattern34Hw {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= n-i ; j++){
                System.out.print("  ");
            }
            for(int j = 1 ; j <= i*2-1 ;j++){
                System.out.print((j+i+1)%2 + " ");
            }
            System.out.println();
        }
    }
}
