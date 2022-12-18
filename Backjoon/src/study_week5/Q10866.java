package study_week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<String> deque = new LinkedList<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            switch (st.nextToken()){
                case("push_front"):
                    deque.addFirst(st.nextToken());
                    break;
                case("push_back"):
                    deque.addLast(st.nextToken());
                    break;
                case("pop_front"):
                    sb.append(deque.size()==0?"-1\n":deque.pollFirst()+"\n");
                    break;
                case("pop_back"):
                    sb.append(deque.size()==0?"-1\n":deque.pollLast()+"\n");
                    break;
                case("size"):
                    sb.append(deque.size()+"\n");
                    break;
                case("empty"):
                    sb.append(deque.isEmpty()?"1\n":"0\n");
                    break;
                case("front"):
                    sb.append(deque.size()==0?"-1\n":deque.peek()+"\n");
                    break;
                case("back"):
                    sb.append(deque.size()==0?"-1\n":deque.peekLast()+"\n");
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);

    }
}
