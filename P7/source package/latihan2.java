import java.util.Scanner;
public class latihan2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilihan :");
        System.out.println("a. Ayam ");
        System.out.println("b. Beuang");
        System.out.print("Pilih hewan:");
        String pilihan = input.nextLine();

        switch(pilihan){
            case "a":
                System.out.println("Ayam");
                break;
            case "b":
                System.out.println("Beruang");
                break;
            default:
                System.out.println("Hewan tidak tersedia");
        }
    System.out.println("Pilihan kamu: " + pilihan);
    input.close();
    }
}
