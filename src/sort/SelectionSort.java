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


    public static void main(String []args){
        Integer []arr = {1, 4, 2, 3, 6, 5};
        SelectionSort.sort(arr);
        Student []students = {new Student("Alice", 98), new Student("Bob", 95),  new Student("Charles", 65)};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        SelectionSort.sort(students);
        for (Student s : students){
            System.out.println(s);
        }
    }
}
