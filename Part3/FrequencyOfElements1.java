package Part3;

public class FrequencyOfElements1 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,2,3,4,3} ;

        int max = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
           if(arr[i]>max)
               max = arr[i];
        }
        int[] b = new int[max+1];
        for(int i = 0 ; i < arr.length ; i++){
            b[arr[i]]++;
        }
        for(int i = 0 ; i < b.length ; i++){
            if(b[i] > 0)
                System.out.println(i + " has frequency of " + b[i]);
        }
    }

}
