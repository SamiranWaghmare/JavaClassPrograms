package Part3;

public class EvenNumbersCount {
    public static void main(String[] args) {
        int[] a = Arrays.readArray();
        Arrays.displayArray(a);
        int count = 0;
        for(int i = 0; i < a.length ; i++){
            if(a[i]%2 == 0)
                count++;
        }
        System.out.println("there are " + count +" even numbers digit numbers int this array");
    }
}
