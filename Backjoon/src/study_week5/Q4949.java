package study_week5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Q4949 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        while (true){
            Stack<Character> stack = new Stack<>();
            String str = s.nextLine();
            if(str.equals(".")) break;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '(' || c == '[') stack.push(c);
                else if (c == ')') {
                    if (stack.empty() || stack.peek()!= '(') {
                        stack.push(c);
                    }else stack.pop();
                } else if (c == ']') {
                    if (stack.empty() || stack.peek()!= '[') {
                        stack.push(c);
                    }else stack.pop();
                }
            }
            sb.append(stack.empty() ? "yes\n" : "no\n");

        }
        System.out.println(sb);
    }
}
