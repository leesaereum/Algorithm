package study_week3;

import java.util.Scanner;

public class 문자열밀기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        int answer = solution(A,B);
        System.out.print(answer);
    }
    public static int solution(String A, String B) {
        int result = 0;
        while(result<=A.length()){
            if(A.equals(B)) return result;
            A = Character.toString(A.charAt(A.length()-1)) +  A.substring(0,A.length()-1);
            result ++;
        }
        return -1;
    }
}
