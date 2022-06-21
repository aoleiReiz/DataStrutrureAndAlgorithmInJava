package sort;

public class InsertionSort {

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            E ele = arr[i];
            int j = i;
            for (; j > 0 && arr[j - 1].compareTo(ele) > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = ele;
        }
    }
}
