package JSpider_Class_Ques;

public class ReminderWOmodulus {
    public static void main(String[] args) {
        getRemainder(433343,43);
    }
    public static void getRemainder(int a , int b){
        System.out.println(a - b * (a/b) );
        System.out.println(a%b);
    }
}
