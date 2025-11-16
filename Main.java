import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        String filename = "students.txt";

        // Load at start
        manager.students = FileUtil.loadStudents(filename);
        System.out.println("Loaded students from file:");
        manager.viewStudents();

        while (true) {
            System.out.println("\n===== Student Record Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by Name");
            System.out.println("4. Delete by Name");
            System.out.println("5. Sort by Marks");
            System.out.println("6. Save and Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt(); sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();

                    manager.addStudent(new Student(roll, name, email, course, marks));
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    System.out.print("Search Name: ");
                    manager.searchByName(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Delete Name: ");
                    manager.deleteByName(sc.nextLine());
                    break;

                case 5:
                    manager.sortByMarks();
                    break;

                case 6:
                    FileUtil.saveStudents(filename, manager.students);
                    System.out.println("Saved successfully. Exiting...");
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
