package Part3;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] userArray = Arrays.readArray();
        Arrays.displayArray(userArray);
        int sum = 0;
        for(int i = 0 ; i < userArray.length ; i++){
            sum = sum + userArray[i];
        }

        System.out.println("sum of the userArray is : " + sum);
    }

}
