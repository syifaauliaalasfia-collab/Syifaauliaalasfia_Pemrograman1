import java.util.Scanner;

public class latihan1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String nama = "";
        String kelas = "";
        final String jurusan = "Teknik Informatika";
        int pilihan;

        do
        {
            System.out.println("1. Input nama");
            System.out.println("2. Data tidak ditemukan");
            System.out.println("3. Tampilkan data");
            System.out.print("Pilih: ");
            
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1)
            {
                System.out.print("Masukkan nama: ");
                nama = input.nextLine();

                // Switch
                System.out.println("Pilih kelas:");
                System.out.println("1 = A");
                System.out.println("2 = B");
                System.out.println("3 = CK");
                System.out.println("4 = CS");
                System.out.print("Masukkan pilihan kelas: ");
                int pilihKelas = input.nextInt();
                input.nextLine();

                switch (pilihKelas)
                {
                    case 1:
                        kelas = "A";
                        break;
                    case 2:
                        kelas = "B";
                        break;
                    case 3:
                        kelas = "CK";
                        break;
                    case 4:
                        kelas = "CS";
                        break;
                    default:
                        kelas = "A"; // otomatis A jika bukan 1-4
                }

                System.out.println("Data berhasil disimpan");
            } 
            else if (pilihan == 2)
            {
                System.out.println("Data tidak ditemukan");
            } 
            else if (pilihan == 3)
            {
                if (nama.equals(""))
                {
                    System.out.println("Data belum disimpan");
                } 
                else
                {
                    System.out.println("Nama: " + nama);
                    System.out.println("Jurusan: " + jurusan);
                    System.out.println("Kelas: " + kelas);
                }
            } 
            else if (pilihan != 0)
            {
                System.out.println("Pilihan tidak valid");
            }

        } while (pilihan != 0);

        input.close();
    }   
}