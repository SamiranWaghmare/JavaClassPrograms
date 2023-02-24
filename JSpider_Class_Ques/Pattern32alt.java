package JSpider_Class_Ques;

public class Pattern32alt {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n ; j++){
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
