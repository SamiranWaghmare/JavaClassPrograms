package JSpider_Class_Ques;

public class Pattern31hw {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n ; i++){
            for(int j = n ; j > i ; j--){
                System.out.print("  ");
            }
            int altJ = 1;
            for( int j = 1 ; j <= i*2-1 ; j++){
                if(j>i){
                    System.out.print(altJ + " ");
                    altJ++;
                }else{
                    System.out.print(j+ " ");
                }
            }
            System.out.println();
        }
    }
}
