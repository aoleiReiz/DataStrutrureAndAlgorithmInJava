package sort;

public class Student  implements Comparable<Student>{

    private String name;
    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        if (this.score < o.score){
            return -1;
        }else if (this.score == o.score){
            return 0;
        }
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Student){
            return ((Student) obj).name.equals(this.name) && ((Student) obj).score == this.score;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Student(name: %s. score: %d)", this.name, this.score);
    }
}
