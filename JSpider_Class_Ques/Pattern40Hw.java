package JSpider_Class_Ques;

public class Pattern40Hw {
    public static void main(String[] args) {
        int n = 7;
        int sp = n/2;
        int st = 1;

        for(int i = 1; i <= n ; i++){
            for(int j = sp ; j >= 1; j--){
                System.out.print("  ");
            }
            for(int j = 1 ; j <= st ; j++){
                System.out.print((j+i+1)%2 + " ");
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
