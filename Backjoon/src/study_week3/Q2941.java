package study_week3;

import java.util.Scanner;

public class Q2941 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String str = s.nextLine().trim();
        for (int i = 0; i < croatia.length; i++) {
            str = str.replaceAll(croatia[i],",");
        }
        System.out.print(str.length());
    }
}
