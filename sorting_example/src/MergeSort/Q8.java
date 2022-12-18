package MergeSort;

public class Q8 {
    static void mergeSort(int[] a,int[] b, int[] c){
        int na = a.length; // a 정렬 길이
        int nb = b.length; // b 정렬 길이
        int pa = 0; // a 정렬 포인터
        int pb = 0; // b 정렬 포인터
        int pc = 0; // c 정렬 포인터

        System.out.print("배열 a [ ");
        for (int l = 0; l < a.length; l++) System.out.print(a[l]+" ");
        System.out.println("]");
        System.out.print("배열 b [ ");
        for (int l = 0; l < b.length; l++) System.out.print(b[l]+" ");
        System.out.println("]");

        while (pa < na && pb <nb){
            if(a[pa] <= b[pb]){
                System.out.println("a 배열값 "+a[pa]+" 추가");
                c[pc] = a[pa];
                pc++;
                pa++;
            }else{
                System.out.println("b 배열값 "+b[pb]+" 추가");
                c[pc] = b[pb];
                pc++;
                pb++;
            }
        }
        while (pa < na){
            System.out.println("a 배열값 "+a[pa]+" 추가");
            c[pc] = a[pa];
            pc++;
            pa++;
        } // a에만 요소가 남아있을 경우, a 요소값을 차례대로 넣어줌
        while (pb < nb){
            System.out.println("b 배열값 "+b[pb]+" 추가");
            c[pc] = b[pb];
            pc++;
            pb++;
        } // b에만 요소가 남아있을 경우, b 요소값을 차례대로 넣어줌

        System.out.print("배열 c [ ");
        for (int l = 0; l < c.length; l++) System.out.print(c[l]+" ");
        System.out.println("]");
    }
    public static void main(String[] args) {
        int[] a = {2,4,6,8,11,13};
        int[] b = {1,2,3,4,9,16,21};
        int[] c = new int[13];
        mergeSort(a,b,c);
    }
}