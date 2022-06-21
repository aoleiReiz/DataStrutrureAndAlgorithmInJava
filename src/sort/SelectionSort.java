package sort;

public class SelectionSort {

    private SelectionSort(){}

    public static <E extends Comparable<E>>void sort(E []arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0){
                    minIndex = j;
                }
            }
            swap(arr, minIndex, i);
        }
    }

    private static <E> void swap(E []arr, int i, int j){
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
