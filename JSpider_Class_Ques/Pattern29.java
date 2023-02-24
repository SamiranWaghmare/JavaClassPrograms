package JSpider_Class_Ques;

public class Pattern29 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1 ; i<=n ; i++){
            for(int j = n ; j > i ; j--){
                System.out.print("  ");
            }
            String s="";
            for (int j=1;j<i;j++) {
                s = s + j+" * ";
            }
            s=s+" "+i;
            System.out.println(s);
        }
    }
}
