package study_week5;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if(num!=0) al.add(num);
            else al.remove(al.size()-1);
        }
        int sum = 0;
        for (int i = 0; i < al.size(); i++) {
            sum+= al.get(i);
        }

        System.out.println(sum);
    }
}
