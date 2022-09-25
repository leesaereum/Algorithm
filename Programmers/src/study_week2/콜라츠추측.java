package study_week2;

import java.util.Scanner;

public class 콜라츠추측 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int answer = solution(n);
        System.out.print(answer);
    }
    public static int solution(Long num) {
        int answer = 0;
        for(int i=0;i<=500;i++){
            if(num==1){
                answer = i;
                return answer;
            }else if(num%2==0) num/=2;
            else num = num*3+1;
        }
        return -1;
    }
}
