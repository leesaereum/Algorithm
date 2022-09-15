package study_week1;

import java.util.Scanner;

public class 최대공약수와최소공배수 {
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
        //초기값 설정
        int max = 1;
        int min = n*m;

        //n이 m보다 크면 자리 바꾸기
        if(n>m){
            int o = n;
            n = m;
            m = o;
        }

        //최대공약수 구하기
        //두 수가 나눠지고 max보다 큰 값을 대입
        for(int i=1;i<=m;i++){
            if(n%i==0&&m%i==0&&i>max){
                max = i;
            }
        }

        //최소공배수 구하기
        //두 수로 나눠지고 min보다 작으면 break로 빠져나오기
        for(int i=n;i<=n*m;i++){
            if(i%n==0&&i%m==0&&i<min){
                min = i;
                break;
            }
        }

        int[] answer = {max,min} ;
        return answer;
    }
}
