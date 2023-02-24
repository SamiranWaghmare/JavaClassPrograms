package JSpider_Class_Ques;

public class Pattern39alt {
    public static void main(String[] args) {
        int n = 7 ;
        int sp = n/2;
        int st = 1;

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= sp+st ; j++){
                if(j == sp+1 || j == sp+st){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            if(i <= n/2){
                sp--;
                st += 2;
            }else{
                sp++;
                st -= 2;
            }
            System.out.println();
        }
    }
}
