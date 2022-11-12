package study_week4;

import java.util.*;

public class Q1181 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String str = s.next();
            if(!arr.contains(str)) arr.add(str);
        }

        Comparator<String> c = new Comparator<String>() {
            public int compare(String s1, String s2) {
                if(s1.length()!=s2.length())
                    return Integer.compare(s1.length(),s2.length());
                else
                    return s1.compareTo(s2);
            }
        };

        Collections.sort(arr,c);
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
