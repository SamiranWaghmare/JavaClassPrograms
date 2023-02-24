package JSpider_Class_Ques;
//1
//A B
//1 2 3
//A B C D
//1 2 3 4 5

public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1 ; i <= n ; i++){

            for(int j = 1 ; j <= i; j++){
                if(i%2 == 1){
                    System.out.print(j + " ");
                }else{
                    System.out.print((char)(64+j) + " ");
                }
            }
            System.out.println();
        }
    }
}