package study_week2;

import java.util.Scanner;

public class 나머지가1이되는수찾기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = solution(n);
        System.out.print(answer);
    }
        public static int solution(int n) {
            int answer = 0;
            for(int i=1;i<n;i++){
                if(n%i==1){
                    answer = i;
                    break;
                }
            }
            return answer;
        }
    }
