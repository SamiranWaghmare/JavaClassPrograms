package Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        if(isBalanced(s)){
            System.out.println(s + " is balanced");
        }else{
            System.out.println(s + " is not balanced");
        }
    }

    public static boolean isBalanced(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(c=='{' || c== '[' || c=='('){
                st.push(c);
            } else if (c=='}'|| c == ']' || c==')') {
                char x;
                switch(c){
                    case'}': x = st.pop();
                    if(x =='[' || x== '(')
                        return false;
                    else break;

                    case']': x = st.pop();
                    if(x == '(' || x == '{')
                        return false;
                    else break;

                    case')': x = st.pop();
                    if(x == '{' || x == '[')
                        return false;
                    else break;
                }
            }
        }
        return st.isEmpty();
    }
}

