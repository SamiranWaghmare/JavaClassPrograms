package JSpider_Class_Ques;
//1
//1*2
//1*2*3
//1*2*3*4
//1*2*3*4*5

public class  Pattern13 {
    public static void main(String[] args) {
        int n = 5;
        int i = 1 ;
        String sum = i + "" ;

        while(i<= n){
            System.out.println(sum);
            i++;
            sum += "*"+i;
        }
    }
}
