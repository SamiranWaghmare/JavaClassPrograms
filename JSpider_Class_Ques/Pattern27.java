package JSpider_Class_Ques;

public class Pattern27 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<= n ; i++){
            for(int j = 1; j<=n ;j++){
                if(n+i-j<=n){
                    System.out.print(n+i-j+ " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
