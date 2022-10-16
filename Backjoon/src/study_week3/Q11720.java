package study_week3;

import java.util.Scanner;

public class Q11720 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        String[] str = s.next().split("");
        for(int i=0;i<n;i++){
            sum += Integer.parseInt(str[i]);
        }
        System.out.print(sum);
    }
}
