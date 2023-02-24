package Part3;

public class  ContinuousLargestSum {
    public static void main(String[] args) {
        int[] a = {6,-3,1,2,-1,11,-3,4,12} ;

        int sum = 0 , max = 0 ;
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] < 0){
                sum = 0;
            }else{
                sum = sum + a[i];
            }
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
