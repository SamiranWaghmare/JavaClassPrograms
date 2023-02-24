package JSpider_Class_Ques;

public class Pattern35alt {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n ; i++){
            int toLeft = i;
            int toRight = 2;

            for(int j =1 ; j <= n-1+i; j++){
                if(j <= n-i){
                    System.out.print("  ");
                }else{
                    if(j > n){
                        System.out.print(toRight + " ");
                        toRight++;
                    }else{
                        System.out.print(toLeft + " ");
                        toLeft--;
                    }
                }
            }
            System.out.println();
        }
    }
}
