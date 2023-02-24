package JSpider_Class_Ques;

public class Pattern42Hw {
    public static void main(String[] args) {
        int n = 5;
        int sp = n-1;


        for(int i = 1 ; i<= n ; i++){

            for(int j = 1 ; j <= sp ; j++){
                System.out.print("  ");
            }
            for(int j = i ; j >= 1 ; j--){
                System.out.print((char)(64+j) + " ");

            }
            for(int j = 2 ; j<=i ; j++){
                System.out.print((char)(64+j)+ " ");

            }
            sp--;
            System.out.println();
        }
    }
}
