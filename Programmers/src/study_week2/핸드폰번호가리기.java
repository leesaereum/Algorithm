package study_week2;

import java.util.Scanner;

public class 핸드폰번호가리기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String answer = solution(n);
        System.out.print(answer);
    }

        public static String solution(String phone_number) {
            String answer = "";
            for(int i=0;i<phone_number.length()-4;i++){
                answer+="*";
            }
            answer+=phone_number.substring(phone_number.length()-4,phone_number.length());
            return answer;
    }
}
