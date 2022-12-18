package study_week5;

public class 올바른괄호 {
    public static void main(String[] args) {
        String s = "(())()";
        System.out.println(solution(s));
    }
    static boolean solution(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') sum ++;
            else sum --;
            if(sum<0) return false;
        }
        return sum==0?true:false;
    }
}
