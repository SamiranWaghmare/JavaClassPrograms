package JSpider_Class_Ques;

public class Pattern38 {
    public static void main(String[] args) {
        int n = 7 ;
        int sp = 0 ;
        int st = n ;

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j<=sp ; j++ ){
                System.out.print("  ");
            }

            for(int j = 1 ; j <= st ; j++){
                System.out.print("* ");
            }

            System.out.println();
            if(i <= n/2){
                sp++;
                st = st-2;
            }else{
                sp--;
                st = st+2;
            }
        }
    }

}
