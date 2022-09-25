package study_week2;

import java.util.Scanner;

public class 음양더하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] absolutes = new int[n];
        boolean[] signs = new boolean[n];
        for(int i=0;i<n;i++){
            absolutes[i] = scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            if(scanner.nextInt()==0) signs[i] = false;
            else signs[i]=true;
        }
        int answer = solution(absolutes,signs);
        System.out.print(answer);
    }
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0;i<signs.length;i++){
            if(signs[i]) answer+=absolutes[i];
            else answer-=absolutes[i];
        }
        return answer;
    }
}
