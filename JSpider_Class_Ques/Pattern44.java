package JSpider_Class_Ques;

public class Pattern44{
    public static void main(String[] args) {
        int n = 7   ;
        int sp = n/2;
        int st = 1;

        for(int i = 1 ; i <= n ; i++){
            for(int j =1 ; j <= sp ;j++){
                System.out.print("  ");
            }
            int k = sp+1;
            for(int j = 1; j <= st ; j++){
                System.out.print(k+ " ");
                if(j <= st/2){
                    k++;
                }else{
                    k--;
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
