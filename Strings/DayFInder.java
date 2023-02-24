package Strings;

public class DayFInder {
    public static void main(String[] args) {
        System.out.println(dayfinder(12,02,2023));
    }


    public static String dayfinder(int d , int m , int y) {
        String days[] = {"Sunday", "Monday", "Tuesday", "Tuesday", "Wednesday", "Thurday", "Friday", "Saturday"};
        int months[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (y % 400 == 0 || y % 4 == 0 && y % 100 != 0) {
            months[2] = 29;
        }
        int y1 = y - 1;
        int nod = y1 * 365 + y1 / 400 + y1 / 4 - y1 / 100;
        for (int i = 1; i < m; i++) {
            nod = nod + months[i];
        }
        nod = nod + d;
        return days[nod % 7];
    }

}

