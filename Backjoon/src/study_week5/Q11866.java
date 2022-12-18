package study_week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int tmp = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();
        StringBuffer sb = new StringBuffer("<");
        for (int i = 1; i <= N ; i++) {
            queue.add(i);
        }
        int count = 1;
        while (queue.size()!=1){
            if(count!=tmp){
                queue.add(queue.poll());
                count++;
            }else {
                sb.append(queue.poll()+", ");
                count = 1;
            }
        }
        sb.append(queue.poll()+">");
        System.out.println(sb);
    }
}
