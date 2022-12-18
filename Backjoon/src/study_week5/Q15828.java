package study_week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Q15828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<String> queue = new LinkedList<>();
        while(true){
            String s = br.readLine();
            if(s.equals("0")){
                queue.poll();
            } else if (s.equals("-1")) {
                break;
            } else {
                if(queue.size()<N)
                queue.add(s);
            }
        }
        if(queue.size()==0){
            System.out.println("empty");
        }else{
            int num = queue.size();
            for (int i = 0; i < num; i++) {
                System.out.print(queue.poll()+" ");
            }
        }
    }
}
