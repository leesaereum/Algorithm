package study_week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        String sb = br.readLine();
        StringTokenizer st = new StringTokenizer(sb, " ");
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(!arr.contains(num)) arr.add(num);
        }
        Collections.sort(arr);

        for (int i = 0; i < arr.size(); i++) {
            sb = sb.replaceAll(Integer.toString(arr.get(i)),Integer.toString(i));
        }
        System.out.print(sb);
    }
}
