package JSpider_Class_Ques;
// A A A A A
// B B B B B
// C C C C C
// D D D D D
// E E E E E

public class Pattern9 {
    public static void main(String[] args) {
        int size = 5;
        char alphabet = 'A';

        for(int row = 1 ; row <= size ; row++){
            for(int col = 1 ; col <= size ; col++){
                System.out.print(alphabet + " ");
            }
            System.out.println();
            alphabet++;
        }
    }
}
