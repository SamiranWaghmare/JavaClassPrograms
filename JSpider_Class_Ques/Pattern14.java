package JSpider_Class_Ques;
//5 4 3 2 1
//4 3 2 1
//3 2 1
//2 1
//1
public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;
        int m = n;

        for(int i = 1 ; i <=n ; i++){
            for(int j = m ; j > 0 ; j--){
                System.out.print(j + " ");
            }
            System.out.println();
            m--;
        }
    }
}
