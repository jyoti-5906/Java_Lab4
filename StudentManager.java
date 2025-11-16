import java.util.*;

public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void viewStudents() {
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void searchByName(String name) {
        boolean found = false;
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println(s);
                found = true;
            }
        }
        if (!found)
            System.out.println("Student not found!");
    }

    public void deleteByName(String name) {
        Iterator<Student> it = students.iterator();
        boolean removed = false;

        while (it.hasNext()) {
            if (it.next().getName().equalsIgnoreCase(name)) {
                it.remove();
                removed = true;
                System.out.println("Student deleted!");
                break;
            }
        }

        if (!removed)
            System.out.println("Student not found!");
    }

    public void sortByMarks() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return Double.compare(b.getMarks(), a.getMarks());
            }
        });
        System.out.println("Sorted Student List by Marks:");
        viewStudents();
    }
}
