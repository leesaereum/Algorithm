package study_week3;

import java.util.Scanner;

public class 숫자문자열과영단어 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int answer = solution(s);
        System.out.print(answer);
    }
    public static int solution(String s) {
        String[] alphabet = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        String[] number = {"0","1","2","3","4","5","6","7","8","9"};
        for(int i=0;i<number.length;i++){
            if(s.contains(alphabet[i]))
            s = s.replaceAll(alphabet[i],number[i]);
        }
        return Integer.parseInt(s);
    }
}
