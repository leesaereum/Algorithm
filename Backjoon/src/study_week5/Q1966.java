package study_week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int nums = Integer.parseInt(st.nextToken());
            int times = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine()," ");
            Queue<Integer> queue = new LinkedList<>();
            for (int j = 0; j < nums; j++) {
                queue.add(Integer.parseInt(st.nextToken()));
            }

        }
    }
}
