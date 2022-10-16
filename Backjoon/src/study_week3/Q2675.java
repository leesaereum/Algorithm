package study_week3;

import java.util.Scanner;

public class Q2675 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;i++) {
            int times = s.nextInt();
            String[] str = s.next().split("");
            String result = "";
            for(int k=0;k<str.length;k++) {
                for (int j = 0; j < times; j++) {
                    result += str[k];
                }
            }
            System.out.println(result);
        }
    }
}
