/*12S24022_Ingrate Joy Sihombing*/
package academic.driver;

import academic.model.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // Autograder tidak memerlukan teks instruksi di awal
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            
            // Berhenti jika menemukan tanda ---
            if (line.equals("---")) {
                break;
            }

            String[] parts = line.split("#");

            // Pastikan format input sesuai (4 bagian)
            if (parts.length == 4) {
                String id = parts[0];
                String name = parts[1];
                // Mengambil tahun (year) dan prodi (studyProgram)
                String year = parts[2]; 
                String studyProgram = parts[3];

                // Menambahkan ke list
                students.add(new Student(id, name, year, studyProgram));
            }
        }

        // Cetak hasil akhir secara bersih tanpa teks tambahan
        for (Student student : students) {
            System.out.println(student.toString());
        }

        scanner.close();
    }
}