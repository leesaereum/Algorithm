package study_week3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class 문자열정렬하기_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        ArrayList<Integer> answer = solution(s);
        System.out.print(answer);
    }
    public static ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList();
        char[] number = {'0','1','2','3','4','5','6','7','8','9'};
        for(int i=0;i<my_string.length();i++){
            for(int j=0;j<=9;j++){
                if(my_string.charAt(i)==number[j]) answer.add((int)my_string.charAt(i)-48);
            }
        }
        answer.sort(Comparator.naturalOrder());
        return answer;
    }
}
