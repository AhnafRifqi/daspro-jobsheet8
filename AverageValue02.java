import java.util.Scanner;

public class AverageValue02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNilai;
        int nilaiMhs;
        double rataNilai;

        int i = 1;
        while (i <= 5) {
            System.out.println("Input Nilai Mahasiswa ke " + i);
            totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs = scanner.nextInt();
                totalNilai += nilaiMhs;
            }
            rataNilai = totalNilai / 5.0;
            System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
            i++;
        }
    }
}
