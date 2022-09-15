package study_week1;

import java.util.Scanner;

public class x만큼간격이있는n개의숫자 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        int b = scanner.nextInt();
        long[] answer = solution(a,b);
        for(int i=0;i<answer.length;i++){
        System.out.print(answer[i]+" ");

        }
    }
    public static long[] solution(long x, int n) {
        long[] answer = new long[n];
        for(int i=0;i<n;i++){
            answer[i] = x+(i*x);
        }
        return answer;
    }
}
