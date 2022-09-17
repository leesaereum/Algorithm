package study_week1;

import java.util.Scanner;

public class Q11021 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for(int i=1;i<=N;i++){
            int A = s.nextInt();
            int B = s.nextInt();
            System.out.println("Case #"+i+": "+(A+B));
        }
    }
}
