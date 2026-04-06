import java.util.Scanner;

public class Tugas1Minggu {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        // Array untuk menyimpan data 7 hari
        double[][] data = new double[7][5]; // 7 hari x 5 item
        boolean[][] adaPembelian = new boolean[7][5]; // Track apakah ada pembelian
        String[] hari = {"Hari 1", "Hari 2", "Hari 3", "Hari 4", "Hari 5", "Hari 6", "Hari 7"};
        String[] item = {"Buku Tulis", "Pulpen", "Pensil", "Penghapus", "Tas Sekolah"};
        
        // Input data untuk 7 hari
        for (int h = 0; h < 7; h++) 
        {
            System.out.println("\n=== INPUT " + hari[h].toUpperCase() + " ===");
            for (int i = 0; i < 5; i++) 
            {
                System.out.print("Masukkan harga " + item[i] + " (0 = tidak ada): ");
                double harga = input.nextDouble();
                if (harga == 0) 
                {
                    data[h][i] = 0;
                    adaPembelian[h][i] = false;
                } else 
                {
                    data[h][i] = harga;
                    adaPembelian[h][i] = true;
                }
            }
        }

        // Output hasil untuk setiap hari
        double grandTotal = 0;
        for (int h = 0; h < 7; h++) 
        {
            // Hitung total harian (hanya item yang ada pembelian)
            double totalHarian = 0;
            for (int i = 0; i < 5; i++) 
            {
                if (adaPembelian[h][i]) 
                {
                    totalHarian += data[h][i];
                }
            }
            grandTotal += totalHarian;

            // Hitung persentase harian (hanya untuk item yang ada)
            double[] persen = new double[5];
            for (int i = 0; i < 5; i++) 
            {
                if (adaPembelian[h][i] && totalHarian > 0) 
                {
                    persen[i] = (data[h][i] / totalHarian) * 100;
                } else 
                {
                    persen[i] = 0;
                }
            }

            // Output per hari
            System.out.println("\n=== " + hari[h].toUpperCase() + " ===");
            System.out.println("DATA PEMBELIAN:");
            for (int i = 0; i < 5; i++)
            {
                if (adaPembelian[h][i]) 
                {
                    System.out.printf("%-15s = Rp %.0f\n", item[i], data[h][i]);
                } else 
                {
                    System.out.printf("%-15s = -\n", item[i]);
                }
            }
            
            System.out.printf("\nTotal %s = Rp %.0f\n", hari[h], totalHarian);

            System.out.println("\nPERSENTASE:");
            for (int i = 0; i < 5; i++) 
            {
                if (adaPembelian[h][i] && totalHarian > 0) 
                {
                    System.out.printf("%-15s = %.2f%%\n", item[i], persen[i]);
                } else
                {
                    System.out.printf("%-15s = -\n", item[i]);
                }
            }
            System.out.println();
        }
        
        // Ringkasan mingguan
        System.out.println("=== RINGKASAN 1 MINGGU ===");
        System.out.printf("GRAND TOTAL 7 HARI = Rp %.0f\n", grandTotal);
        System.out.printf("Rata-rata harian   = Rp %.0f\n", grandTotal / 7);

        input.close();
    }
}