import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Realisasi                 : ");
        int realisasi = input.nextInt();

        System.out.print("Masukan jumlah kehadiran  : ");
        int kehadiran = input.nextInt();

        System.out.print("Masukan nilai tugas       : ");
        double tugas = input.nextDouble();

        System.out.print("Masukan nilai uts         : ");
        double uts = input.nextDouble();

        System.out.print("Masukan nilai uas         : ");
        double uas = input.nextDouble();

        // BOBOT SESUAI RUMUS
        // Bobot Kehadiran 
        double bobotKehadiran = (kehadiran / (double) realisasi) * 10;
        
        // Bobot Tugas 
        double bobotTugas = tugas * 20 / 100;
        
        // Bobot UTS 
        double bobotUTS = uts * 30 / 100;
        
        // Bobot UAS
        double bobotUAS = uas * 40 / 100;

        // TOTAL 
        double total = bobotKehadiran + bobotTugas + bobotUTS + bobotUAS;

        // Output hasil
        System.out.println("\n== Hasil ==");
        System.out.printf("Realisasi       : %.2f\n", (double) realisasi);
        System.out.printf("Nilai Kehadiran : %.2f\n", bobotKehadiran);
        System.out.printf("Nilai Tugas     : %.2f\n", bobotTugas);
        System.out.printf("Nilai UTS       : %.2f\n", bobotUTS);
        System.out.printf("Nilai UAS       : %.2f\n", bobotUAS);
        System.out.printf("Total Nilai     : %.2f\n", total);

        input.close();
    }
}