package JSpider_Class_Ques;

public class Pattern29alt {
    public static void main(String[] args) {
        int n = 5;
        int sp = n-1 ;
        for(int i = 1 ; i <= n ; i++){
            for(int j=1 ;j<=sp ; j++){
                System.out.print("  ");
            }for(int j = 1 ; j<=i ; j++){
                if(j==1){
                    System.out.print(j);
                }else{
                    System.out.print(" * "+j);
                }
            }
            System.out.println();
            sp--;
        }
    }
}
