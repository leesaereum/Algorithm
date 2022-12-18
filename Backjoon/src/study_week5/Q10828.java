package study_week5;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10828 {
    static int length = 0;
    static ArrayList<Integer> stack = new ArrayList<>();

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            String str = s.next();
            switch (str) {
                case "push":
                    push(s.nextInt());
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(length).append("\n");
                    break;
                case "empty":
                    sb.append(length==0?1:0).append("\n");
                    break;
                case "top":
                    sb.append(length==0?-1:stack.get(length-1)).append("\n");
                    break;
            }
        }
        System.out.println(sb);

    }
    static void push(int num){
        stack.add(num);
        length++;
    }
    static int pop(){
        if(length==0) return -1;
        else {
            int num = stack.get(length-1);
            stack.remove(length - 1);
            length--;
            return num;
        }
    }
}
