package study_week5;

import java.util.Scanner;

public class Q9012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N; i++) {
            String str = scanner.next();
            String[] strings = str.split("");
            int sum = 0;
            for (int j = 0; j < strings.length; j++) {
                if(strings[j].equals("(")) sum++;
                else sum --;
                if(sum<0){
                    sb.append("NO"+"\n");
                    break;
                }

                if(j== strings.length-1){
                    if(sum==0) sb.append("YES"+"\n");
                    else sb.append("NO"+"\n");
                }
            }

        }
        System.out.println(sb);
    }
}
