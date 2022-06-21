package sort;

public class SortTest {

    public static void main(String []args){
        Integer []arr = {1, 4, 2, 3, 6, 5};
        InsertionSort.sort(arr);
        Student []students = {new Student("Alice", 98), new Student("Bob", 95),  new Student("Charles", 65)};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        InsertionSort.sort(students);
        for (Student s : students){
            System.out.println(s);
        }
    }
}
