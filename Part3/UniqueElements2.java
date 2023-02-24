package Part3;

public class UniqueElements2 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3,4,3,4,5,6,7};
        boolean[] bArr = new boolean[arr.length];

        for(int i = 0 ; i < arr.length ; i++){
           for(int j = i+1 ; j < arr.length; j++){
               if(!bArr[j]){
                   if(arr[i] == arr[j]) {
                       bArr[j] = true;
                       bArr[i] = true;
                   }
               }
           }
        }
        int distinctCount = 0 ;
        for(int i = 0 ; i < bArr.length ; i++){
            if (!bArr[i])
                distinctCount++;
        }
        System.out.println("There are " + distinctCount + " Distinct elements");
    }
}
