import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String nama;
        String nim;
        int umur;
        String ttl;
        String alamat;

        System.out.println("=== INPUT BIODATA MAHASISWA ===");

        System.out.print("Masukan Nama  : ");
        nama    = input.nextLine();

        System.out.print("Masukan NIM   : ");
        nim     = input.nextLine();

        System.out.print("Masukan Umur  : ");
        umur    = input.nextInt();
        input.nextLine();

        System.out.print("Masukan Tempat, Tanggal Lahir  : ");
        ttl     = input.nextLine();

        System.out.print("Masukan Alamat    : ");
        alamat  = input.nextLine();

        System.out.println("=== BIODATA MAHASISWA ===");
        System.out.println("Nama                    : " + nama);
        System.out.println("NIM                     : " + nim);
        System.out.println("Umur                    : " + umur + " tahun ");
        System.out.println("Tempat, Tanggal Lahir   : " + ttl);
        System.out.println("Alamat                  : " + alamat);

        input.close();
    }
}