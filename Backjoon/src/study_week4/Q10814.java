package study_week4;

import java.util.*;

public class Q10814 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        ArrayList<String> name = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N; i++) {
            name.add(s.nextInt()+" " +s.next());
        }
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String a1, String a2) {
                int n1 = Integer.parseInt(a1.split(" ")[0]);
                int n2 = Integer.parseInt(a2.split(" ")[0]);
                if (n1>n2) return 1;
                else if(n1<n2) return -1;
                else return 0;
            }
        };

        Collections.sort(name,c);

        for (int i = 0; i < N; i++) {
            sb.append(name.get(i)+"\n");
        }
        System.out.println(sb);
    }
}
