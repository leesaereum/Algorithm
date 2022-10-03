package study_week3;

import java.util.Scanner;

public class 문자열내p와y의개수 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        boolean answer = solution(s);
        System.out.print(answer);
    }
    static boolean solution(String s) {
        int p = 0;
        int y = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='p'||s.charAt(i)=='P') p++;
            if(s.charAt(i)=='y'||s.charAt(i)=='Y') y++;
        }
        if(p==y) return true;
        else return false;
    }
}
