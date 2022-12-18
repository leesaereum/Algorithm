package study_week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q1021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int times = Integer.parseInt(st.nextToken());
        Deque<Integer> deque = new LinkedList<>();
        int move_count = 0;
        int pop_count = 0;
        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }
        st = new StringTokenizer(br.readLine()," ");
        while (pop_count!=times){
            int num = Integer.parseInt(st.nextToken());
            if(num== deque.peek()){
                deque.pop();
                pop_count ++;
            }else {
                if(num> deque.peek()){
                    int changed = Math.min(d)
                }
            }
        }
    }
}
