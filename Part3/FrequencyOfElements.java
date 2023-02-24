package Part3;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] a = Arrays.readArray();
        Frequency(a);
    }
    public static void Frequency(int[] a){
      boolean[] repeated = new boolean[a.length] ;

      for(int i = 0 ; i < a.length ; i++){
          int count = 1;
        if(!repeated[i]){
            for(int j = i+1 ; j < a.length ; j++){
                if(a[i] == a[j]){
                    count++;
                    repeated[j] = true;
                }
            }
            System.out.println(a[i] + " has frequency of " + count);
        }
      }

    }
}

//It is an efficient way it  array have negative and positive elements
//this program will high time and space complexity
