package NumberTheory;

import java.util.Arrays;

public class KaprekarConstant {
    public static void main(String[] args) {
        int n = 6174;
        int count = 0;

        while (n != 6174){
            int[] arr = new int[4];
            for(int i = 0 ; i < 4 ; i++){
                arr[i] = n%10;
                n = n/10;
            }

            Arrays.sort(arr);
            //ascending and descending numbers
            int asc = arr[0]*1000 + arr[1]*100 + arr[2]*10 + arr[3];
            int desc = arr[3]*1000 + arr[2]*100 + arr[1]*10 + arr[0];

            n = desc-asc;
            count++;
        }

        System.out.println("kaprekars constant reached after iterations : " + count);
    }
}
