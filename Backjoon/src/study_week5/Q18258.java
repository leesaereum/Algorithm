package study_week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<String> queue = new LinkedList<>();
        StringBuffer sb = new StringBuffer();
        String back = "";
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            switch (st.nextToken()){
                case("push"):
                    String s = st.nextToken();
                    queue.add(s);
                    back = s;
                    break;
                case("front"):
                    sb.append(queue.size()==0?"-1\n":queue.peek()+"\n");
                    break;
                case("back"):
                    sb.append(queue.size()==0?"-1\n":back+"\n");
                    break;
                case("pop"):
                    if(queue.size()==0){
                        sb.append("-1\n");
                    }else{
                        sb.append(queue.poll()+"\n");
                    }
                    break;
                case("empty"):
                    sb.append(queue.size()==0?"1\n":"0\n");
                    break;
                case("size"):
                    sb.append(queue.size()+"\n");
                    break;
                default:
                    break;
            }
        }
        System.out.println(sb);
    }
}
