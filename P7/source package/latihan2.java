import java.util.Scanner;
public class latihan2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilihan menu:");
        System.out.println("a. Mie ayam");
        System.out.println("b. bakso");
        System.out.print("Pilih menu:");
        String pilihan = input.nextLine();

        switch(pilihan){
            case "a":
                System.out.println("Mie ayam");
                break;
            case "b":
                System.out.println("Bakso");
                break;
            default:
                System.out.println("Menu tidak tersedia");
        }
    System.out.println("Pilihan kamu: " + pilihan);
    input.close();
    }
}
