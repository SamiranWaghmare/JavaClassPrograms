package JSpider_Class_Ques;

public class Pattern24 {
    public static void main(String[] args) {
        int n = 5;
        int sp = 0;

        for(int i =1 ; i <= n ; i++){

            for(int j = 0 ; j<sp ; j++){
                System.out.print("  ");
            }

            for(int j = (n+1)-i ; j>=1 ; j--){
                System.out.print(j + " ");
            }

            System.out.println();
            sp++;
        }
    }
}
