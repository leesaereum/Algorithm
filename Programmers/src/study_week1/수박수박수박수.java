package study_week1;

import java.util.Scanner;

public class 수박수박수박수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(solution(n));
    }
    public static String solution(int n) {
        String answer = "";
        while(n>=2){
            n-=2;
            answer+="수박";
        }//n이 1이나 0이될때까지 문자열에 "수박" 추가
        if(n==1){
            answer+="수";
        }//한글자 남는다면 "수" 추가
        return answer;
    }
}
