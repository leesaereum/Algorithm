package study_week3;

import java.util.Scanner;

public class Q2908 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = Integer.parseInt(new StringBuffer(s.next()).reverse().toString());
        int num2 = Integer.parseInt(new StringBuffer(s.next()).reverse().toString());
        if(num1>num2) System.out.print(num1);
        else System.out.print(num2);
    }
}
