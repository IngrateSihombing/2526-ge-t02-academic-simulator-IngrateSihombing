/*12S24022_Ingrate Joy Sihombing*/
package academic.driver;

import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Course> courses = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Enrollment> enrollments = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals("---")) {
                break;
            }

            String[] parts = line.split("#");

            if (parts.length > 0) {
                String command = parts[0];

                switch (command) {
                    case "course-add":
                        if (parts.length == 5) {
                            String code = parts[1];
                            String name = parts[2];
                            int credits = Integer.parseInt(parts[3]);
                            String grade = parts[4];
                            courses.add(new Course(code, name, credits, grade));
                        }
                        break;

                    case "student-add":
                        if (parts.length == 5) {
                            String id = parts[1];
                            String name = parts[2];
                            // Pastikan tipe data year di model Student sesuai (String atau int)
                            String year = parts[3]; 
                            String studyProgram = parts[4];
                            students.add(new Student(id, name, year, studyProgram));
                        }
                        break;

                    case "enrollment-add":
                        if (parts.length == 5) {
                            String courseCode = parts[1];
                            String studentId = parts[2];
                            String academicYear = parts[3];
                            String semester = parts[4];
                            enrollments.add(new Enrollment(courseCode, studentId, academicYear, semester));
                        }
                        break;
                }
            }
        }

        // Tampilkan hasil secara berurutan sesuai kategori
        for (Course course : courses) {
            System.out.println(course.toString());
        }

        for (Student student : students) {
            System.out.println(student.toString());
        }

        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment.toString());
        }

        scanner.close();
    }
}