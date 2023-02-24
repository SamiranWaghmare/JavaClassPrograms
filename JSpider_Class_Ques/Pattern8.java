package JSpider_Class_Ques;
//A B C D E
//A B C D E
//A B C D E
//A B C D E
//A B C D E

public class Pattern8 {
    public static void main(String[] args) {
        int size = 5;
        for(int row = 1 ; row <= size ; row++){
            char alphabet = 'A';
            for(int col = 1 ; col <= size ; col++){
                System.out.print(alphabet + " ");
                alphabet++;

            }
            System.out.println();
        }
    }
}
