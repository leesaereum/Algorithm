package study_week1;

import java.util.Scanner;

public class Q25304 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int price = s.nextInt();
        int N = s.nextInt();
        String result = "No";

        for(int i=N;i>0;i--){
            int product = s.nextInt();
            int count = s.nextInt();
            price = price - product*count;
        }
        if(price==0) result = "Yes";
        System.out.print(result);
    }
}
