package PracticeQuestion;

public class Power {
    public static void main(String[] args) {
        System.out.println(pow(0,1));
    }

    public static double pow(int a, int b){
        double sum = 1;

        if(b<0){
            while(b<0){
                sum = sum/a;
                b++;
            }
            return sum ;
        }

        while(b>0){
            sum = sum * a;
            b--;
        }
        return sum ;
    }
}
