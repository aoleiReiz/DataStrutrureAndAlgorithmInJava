package sort;

public class MergeSort {

    private MergeSort() {
    }

    public static <E extends Comparable<E>> void mergeSortDC(E[] arr) {
        if (null == arr || arr.length <= 1) {
            return;
        }
        _mergeSort(arr, 0, arr.length - 1);
    }

    private static <E extends Comparable<E>> void _mergeSort(E[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        _mergeSort(arr, left, mid);
        _mergeSort(arr, mid + 1, right);
        if (arr[mid].compareTo(arr[mid + 1]) > 0) {
            _merge(arr, left, mid, right);
        }
    }

    private static void _merge(Comparable[] arr, int left, int mid, int right) {
        Comparable[] aux = new Comparable[right - left + 1];
        for (int i = left; i <= right; i++) {
            aux[i - left] = arr[i];
        }
        int i = left;
        int j = mid + 1;
        int k = left;
        while (i <= mid && j <= right) {
            if (aux[i - left].compareTo(aux[j - left]) < 0) {
                arr[k++] = aux[i - left];
                i++;
            } else {
                arr[k++] = aux[j - left];
                j++;
            }
        }
        while (i <= mid) {
            arr[k++] = aux[i - left];
            i++;
        }
        while (j <= right) {
            arr[k++] = aux[j - left];
            j++;
        }
    }
}
