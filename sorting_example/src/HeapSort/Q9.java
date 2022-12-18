package HeapSort;

public class Q9 {
    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void downHeap(int[] a, int left, int right){
        int temp = a[left];
        int child;
        int parent;

        for (parent = left; parent<(right+1)/2; parent=child){
            int cl = parent*2+1;
            int cr = cl +1;
            child = (cr <= right&&a[cr]>a[cl])?cr:cl;
            if(temp >= a[child]){
                break;
            }
            a[parent] = a[child];
        }
        a[parent] = temp;
    }
    static void heapSort(int[] a){
        for (int i = (a.length-1)/2; i >= 0 ; i--) {
            downHeap(a,i,a.length-1);
        }

        for (int i = a.length-1; i >0 ; i--) {
            swap(a, 0, i);
            downHeap(a,0,i-1);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,7,10,2,4,6,8,9};
        heapSort(a);
    }
}
