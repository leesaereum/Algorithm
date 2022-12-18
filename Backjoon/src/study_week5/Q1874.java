package study_week5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Q1874 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> nums = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= N; i++) {
            nums.add(i);
        }
        for (int i = 0; i <N; i++) {
            int num = scanner.nextInt();
            if(stack.empty()){
                stack.push(nums.get(0));
                nums.remove(0);
                sb.append("+\n");
            }
            int peak = stack.peek();
            if(peak<num) {
                while (peak != num) {
                    stack.push(nums.get(0));
                    sb.append("+\n");
                    nums.remove(0);
                    peak = stack.peek();
                }
                stack.pop();
                sb.append("-\n");
            } else if (peak==num) {
                stack.pop();
                sb.append("-\n");
            } else {
                sb = new StringBuffer("NO");
                break;
            }
        }
        System.out.println(sb);
    }
}
