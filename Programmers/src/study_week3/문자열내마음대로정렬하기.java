package study_week3;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열내마음대로정렬하기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        String[] strings = new String[num1];
        for(int i=0;i<num1;i++) {
            strings[i] = scanner.nextLine();
        }
        int n = scanner.nextInt();
        String[] answer = solution(strings,n);
        System.out.print(answer);
    }
    public static String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        for(int i=0;i<strings.length;i++){
            answer[i]= strings[i].charAt(n)+strings[i];
        }
        Arrays.sort(answer);
        for(int i=0;i<answer.length;i++){
            answer[i] = answer[i].substring(1,answer[i].length());
        }
        return answer;
    }
}
