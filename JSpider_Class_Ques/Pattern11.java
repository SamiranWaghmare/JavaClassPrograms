package JSpider_Class_Ques;
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
public class Pattern11 {
    public static void main(String[] args) {
        int n = 5;
        int inc = 1 ;

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(inc + " ");
                inc++;
            }
            System.out.println();
        }
    }
}