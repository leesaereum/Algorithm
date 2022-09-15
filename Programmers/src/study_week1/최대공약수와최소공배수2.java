package study_week1;

import java.util.Scanner;

public class 최대공약수와최소공배수2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] answer = solution(a,b);
        for(int i=0;i<answer.length;i++){
            System.out.print(answer[i]+" ");

        }
    }
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        for (int i = 1; i < n + m; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                answer[1] = n * m / answer[0];
            }
        }
        return answer;
    }
}
