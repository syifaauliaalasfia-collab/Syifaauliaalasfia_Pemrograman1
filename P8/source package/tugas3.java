import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai, total = 0, jumlah = 0;
        double rata;
        char pilihan;

        do {
            System.out.print("Masukkan nilai: ");
            nilai = input.nextInt();

            total += nilai;
            jumlah++;

            System.out.print("Input lagi? (y/t): ");
            pilihan = input.next().charAt(0);

        } while (pilihan == 'y' || pilihan == 'Y');

        rata = (double) total / jumlah;

        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata);

        input.close();
    }
}