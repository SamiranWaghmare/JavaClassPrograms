package Part3;

public class FrequencyOfElements2 {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {1, 2, 8, 3, 1, 2, 3, 5, 1};
        //Array fr will store frequencies of element
        int [] fr = new int [arr.length];
        int visited = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    //To avoid counting same element again
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
        }

        //Displays the frequency of each element present in array
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println(arr[i] + " has frequency of " + fr[i]);
        }
    }
}