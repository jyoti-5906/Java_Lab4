import java.io.*;
import java.util.ArrayList;

public class FileUtil {

    public static ArrayList<Student> loadStudents(String filename) {
        ArrayList<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                int roll = Integer.parseInt(data[0]);
                String name = data[1];
                String email = data[2];
                String course = data[3];
                double marks = Double.parseDouble(data[4]);

                students.add(new Student(roll, name, email, course, marks));
            }

        } catch (Exception e) {
            System.out.println("Error loading file: " + e.getMessage());
        }

        return students;
    }

    public static void saveStudents(String filename, ArrayList<Student> students) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Student s : students) {
                bw.write(s.getRollNo() + "," + s.getName() + "," + s.getEmail()
                        + "," + s.getCourse() + "," + s.getMarks());
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }
}
