package study_week5;

public class 프린터 {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;
        System.out.print(solution(priorities,location));
    }
    static public int solution(int[] priorities, int location) {
        int answer = 1;
        int tmp = priorities[location];
        int max = location;
        for(int i=0;i<priorities.length;i++){
            if(i<location){
                if(priorities[i]>=tmp) answer++;
            }else{
                if(max>location){
                    if(priorities[i]>=tmp) answer++;
                }
                else{
                    if(priorities[i]>tmp){
                        answer++;
                        max = i;
                    }
                }
            }
        }
        return answer;

    }
}
