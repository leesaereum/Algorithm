package study_week2;

import java.util.Scanner;

public class 하샤드수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean answer = solution(n);
        System.out.print(answer);
    }

    public static boolean solution(int x) {
        boolean answer = false;
        int num = x;
        int sum = 0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        if(x%sum==0) answer = true;
        return answer;
    }
}
