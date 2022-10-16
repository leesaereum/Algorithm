package study_week3;

import java.util.Scanner;

public class Q10809 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] al = new int[26];
        String str = s.next();
        for(char c='a';c<='z';c++){
            if(str.contains(Character.toString(c))) al[(int)c-97] = str.indexOf(Character.toString(c));
            else al[(int)c-97] = -1;
        }
        for(int i=0;i<26;i++) {
            System.out.print(al[i]);
        }
    }
}
