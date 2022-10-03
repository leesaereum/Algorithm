package study_week3;

import java.util.Scanner;

public class 가운데글자가져오기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String answer = solution(s);
        System.out.print(answer);
    }
    public static String solution(String s) {
        if(s.length()%2!=0){
            return Character.toString(s.charAt(s.length()/2));
        }
        String answer = "";
        answer = Character.toString(s.charAt(s.length()/2-1)) + Character.toString(s.charAt(s.length()/2));
        return answer;
    }
}
