package study_week4;

import java.util.*;

public class Q10814 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] age = new int[N];
        String[] name = new String[N];
        for (int i = 0; i < N; i++) {
            age[i] = s.nextInt();
            name[i] = s.next();
        }
        int num = 0;
        String str = "";
        for (int i = 0; i<N-1 ; i++) {
            for(int j=N-1;j>i;j--){
                if(age[j-1]>age[j]){
                    num = age[j];
                    age[j] = age[j-1];
                    age[j-1] = num;

                    str = name[j-1];
                    name[j-1] = name[j];
                    name[j] = str;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.println(age[i]+" "+name[i]);
        }
    }
}
