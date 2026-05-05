import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nilai, total = 0;
        char pilihan;

        do {
            System.out.print("Masukkan nilai: ");
            nilai = input.nextInt();

            total += nilai;

            System.out.print("Input lagi? (y/t): ");
            pilihan = input.next().charAt(0);

        } while (pilihan == 'y' || pilihan == 'Y');

        System.out.println("Total nilai: " + total);

        input.close();
    }
}