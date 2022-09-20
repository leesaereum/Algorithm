package study_week2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3052 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        ArrayList List = new ArrayList();
        for(int i=0;i<10;i++) {
            int Num = Sc.nextInt()%42;
            if(!List.contains(Num)) {
                List.add(Num);
            }
        }
        System.out.println(List.size());
    }
}