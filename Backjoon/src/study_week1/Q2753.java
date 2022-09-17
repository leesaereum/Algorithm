package study_week1;

import java.util.Scanner;

public class Q2753 {
    public static void main(String[] args) {
        int r=0;
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();

        if(A%4==0&&(A%100!=0||A%400==0)) r=1;

        System.out.print(r);
    }
}
