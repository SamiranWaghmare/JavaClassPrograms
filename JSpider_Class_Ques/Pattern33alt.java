package JSpider_Class_Ques;

public class Pattern33alt {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n ; i++){
            for(int j =1 ; j <= n-1+i; j++){

                if(j <= n-i){
                    System.out.print("  ");
                }else{
                    System.out.print(i%2 + " ");
                }
            }
            System.out.println();
        }
    }
}
