package BubbleSort;

public class Q4 {
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a){
        int k = 0;
        int count0 = 1;
        int count1 = 0;
        int count2 = 0;
        while (k < a.length-1){
            int last = a.length -1;
            System.out.println("패스"+count0+":");
            for (int j = a.length - 1; j > k; j--) {
                count1++;
                for (int l = 0; l < a.length; l++) {
                    if(l==j) {
                        if (a[j - 1] > a[j]) {
                            System.out.print(" + " + a[l]);
                            swap(a, j - 1, j);
                            last = j;
                            count2++;
                        }else System.out.print(" - " + a[l]);
                    }else System.out.print("   " + a[l]);
                }
                System.out.println();
            }
            k = last;
            count0++;
            for (int l = 0; l < a.length; l++) {
                System.out.print("   "+a[l]);
            }
            System.out.println();
        }
        System.out.println("비교를 "+count1+"회 했습니다.");
        System.out.println("교환을 "+count2+"회 했습니다.");
    }
    public static void main(String[] args) {
        int[] a = {1,3,9,4,7,8,6};
        bubbleSort(a);

        System.out.println();
    }
}

