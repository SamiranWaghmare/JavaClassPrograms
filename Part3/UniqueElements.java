package Part3;

public class UniqueElements {
    public static void main(String[] args) {
        int[] a = {1,1,2,4,3,2,2,3};

        int max = a[0];
        for (int i = 1 ; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        int b[] = new int[max + 1];
        for(int i = 0 ; i < a.length ; i++){
            b[a[i]]++;
        }
        int count = 0;
        for(int i = 0; i < b.length ; i++){
            if(b[i] == 1)
                count++;
        }
        System.out.println("there are " + count + " unique elements");
    }
}
