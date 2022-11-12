package BubbleSort;

public class Q3 {
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a){
        int n = 1;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i< a.length-1; i++) {
                int changed = 0;
            System.out.println("패스"+n+":");
            for (int j = a.length - 1; j > i; j--) {
                for (int k = 0; k < a.length; k++) {

                    if(k==j) {
                        if (a[j - 1] > a[j]) {
                            System.out.print(" + "+a[k]);
                            swap(a, j - 1, j);
                            count2 ++;
                            changed++;
                        }
                        else System.out.print(" - "+a[k]);
                    }else System.out.print("   "+a[k]);
                }
                count1++;
                System.out.println();
            }
            for (int k = 0; k < a.length; k++) {
                System.out.print("   "+a[k]);
            }
            System.out.println();
            n++;
                if(changed == 0) break;

        }
        System.out.println("비교를 "+count1+"회 했습니다.");
        System.out.println("교환을 "+count2+"회 했습니다.");
    }
    public static void main(String[] args) {
        int[] a = {6,4,3,7,1,9,8};


        System.out.println();
        bubbleSort(a);

    }
}
