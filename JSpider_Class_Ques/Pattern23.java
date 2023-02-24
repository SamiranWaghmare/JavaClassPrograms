package JSpider_Class_Ques;

public class Pattern23  {
    public static void main(String[] args) {
        int n = 5;
        int sp = 0;

        for(int i =1 ; i <= n ; i++){

            for(int j = 0 ; j<sp ; j++){
                System.out.print("  ");
            }

            for(int j = n ; j>= i ; j--){
                System.out.print(j + " ");
            }

            System.out.println();
            sp++;
        }
    }
}
