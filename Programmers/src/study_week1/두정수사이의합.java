package study_week1;

import java.util.Scanner;
public class 두정수사이의합 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(solution(a,b));
    }

        public static long solution(int a, int b) {
            long answer = 0;

            if(a>b){
                int o = a;
                a = b;
                b = o;
            }//a가 b보다 작은수가 a가 될 수 있게 체인지

            for(int i=a;i<=b;i++){
                answer+=i;
            }//a~b까지 숫자 합치기

            return answer;
    }

}
