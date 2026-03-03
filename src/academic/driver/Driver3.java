/*12S24022_Ingrate Joy Sihombing*/
package academic.driver;

import academic.model.Enrollment;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Enrollment> enrollments = new ArrayList<>();

        // Hapus semua teks instruksi di awal agar tidak terbaca autograder
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            
            if (line.equals("---")) {
                break;
            }

            String[] parts = line.split("#");

            // Pastikan format input sesuai (4 segmen)
            if (parts.length == 4) {
                String courseCode = parts[0];
                String studentId = parts[1];
                String academicYear = parts[2];
                String semester = parts[3];

                // Tambahkan ke list
                enrollments.add(new Enrollment(courseCode, studentId, academicYear, semester));
            }
        }

        // Tampilkan hasil secara langsung tanpa header tambahan
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment.toString());
        }

        scanner.close();
    }
}