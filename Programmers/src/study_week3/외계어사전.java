package study_week3;

import java.util.Scanner;

public class 외계어사전 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        String[] spell = new String[num1];
        for(int i=0;i<num1;i++) {
            spell[i] = scanner.nextLine();
        }
        int num2 = scanner.nextInt();
        String[] dic = new String[num1];
        for(int i=0;i<num1;i++) {
            dic[i] = scanner.nextLine();
        }
        int answer = solution(spell,dic);
        System.out.print(answer);
    }
    public static int solution(String[] spell, String[] dic) {
        for(int i=0;i<dic.length;i++){
            int answer = 0;
            for(int j=0;j<spell.length;j++){
                if(dic[i].contains(spell[j])) answer ++;
            }
            if(answer==spell.length) return 1;
        }
        return 2;
    }
}
