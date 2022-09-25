package study_week2;

import java.util.Scanner;

public class 자연수뒤집어배열만들기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int[] answer = solution(n);
        System.out.print(answer);
    }

    public static int[] solution(long n) {
        StringBuffer sb = new StringBuffer(Long.toString(n));
        sb.reverse();
        int[] answer = new int[sb.length()];
        for(int i=0;i<sb.length();i++){
            answer[i]= (int)sb.charAt(i)-'0';
        }

        return answer;
    }
}
