package study_week1;

import java.util.Scanner;

public class Q8393 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for(int i=N;i>0;i--){
            sum = sum + i;
        }
        System.out.print(sum);
    }
}
