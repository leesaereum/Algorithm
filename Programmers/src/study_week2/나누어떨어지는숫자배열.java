package study_week2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        int divisor = scanner.nextInt();
        ArrayList answer = solution(arr,divisor);
        System.out.print(answer);
    }
        public static ArrayList solution(int[] arr, int divisor) {
            ArrayList answer = new ArrayList();
            for(int i:arr){
                if(i%divisor==0) answer.add(i);
            }
            if(answer.size()==0) answer.add(-1);
            answer.sort(Comparator.naturalOrder());
            return answer;
    }
}
