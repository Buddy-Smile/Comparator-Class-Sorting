import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Ryan", "123 Main"));
        students.add(new Student(2, "Bryan", "321 Main"));
        students.add(new Student(8, "Jared", "412 North"));
        students.add(new Student(3, "John", "784 South"));
        students.add(new Student(1, "Garry", "43 Main"));
        students.add(new Student(4, "Barry", "395 Long"));
        students.add(new Student(7, "Larry", "467 East"));
        students.add(new Student(3, "Mary", "717 South"));
        students.add(new Student(5, "Sandy", "955 Main"));
        students.add(new Student(6, "Mandy", "717 West"));


        Sortcomparators.selectionSort(students, new Namecomparator());
        System.out.println("Sorted by Name:");
        for (Student s : students) {
            System.out.println(s);
        }

        Sortcomparators.selectionSort(students, new Rollnocomparator());
        System.out.println("\nSorted by Roll Number:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}