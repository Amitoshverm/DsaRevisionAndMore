package LinkedList;

import java.util.Arrays;
import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        String str = "a*(r+o*h)";
        System.out.println(sol(str));

    }



    public static String sol(String str) {
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append(ch);
            }

            else if (ch == '^' ||ch == '/' || ch == '*' ||ch == '+' || ch == '-') {
                while((!st.isEmpty() && st.peek() != '(') && (priority(ch) <= priority(st.peek()))) {
                    sb.append(st.pop());
                }
                st.push(ch);
            }
            else if (ch == '(') {
                st.push(ch);
            }
            else if (ch == ')') {
                while (st.peek() != '(') {
                    sb.append(st.pop());
                }
                st.pop();
            }
        }
        while (st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.toString();
    }

    public static int priority(char ch) {
        int p = 0;
        if (ch == '^') {
            p = 3;
        }
        else if (ch == '*' || ch == '/') {
            p = 2;
        }
        else {
            p = 1;
        }
        return p;
    }

}
