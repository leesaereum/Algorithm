package study_week2;

import java.util.Scanner;

public class 이상한문자만들기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String answer = solution(n);
        System.out.print(answer);
    }
    public static String solution(String s) {
        int index = 0;
        String answer = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                if(index%2==0) answer+= Character.toString(s.charAt(i)).toUpperCase();
                else answer+=Character.toString(s.charAt(i)).toLowerCase();
                index++;
            }else {
                index = 0;
                answer += " ";
            }
        }
        return answer;
    }
}
