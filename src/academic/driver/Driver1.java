/*12S24022_Ingrate Joy Sihombingg*/
package academic.driver;

import academic.model.Course;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            
            // Berhenti jika menemukan tanda ---
            if (line.equals("---")) {
                break;
            }

            String[] parts = line.split("#");

            // Pastikan format input sesuai sebelum diproses
            if (parts.length == 4) {
                String code = parts[0];
                String name = parts[1];
                int credits = Integer.parseInt(parts[2]);
                String grade = parts[3];

                // Tambahkan ke list
                courses.add(new Course(code, name, credits, grade));
            }
        }

        // Cetak hasil akhir tanpa teks tambahan
        for (Course course : courses) {
            System.out.println(course.toString());
        }

        scanner.close();
    }
}