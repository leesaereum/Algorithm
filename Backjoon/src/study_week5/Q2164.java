package study_week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N ; i++) {
            queue.add(i);
        }
        int count = 0;
        while (queue.size()!=1){
            if(count%2==0){
                queue.poll();
            }else{
                queue.add(queue.poll());
            }
            count++;
        }
        System.out.println(queue.peek());
    }
}
