//TUGAS BERKAITAN DENGAN IF ELSE 
import java.util.Scanner;
public class tugas1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan umur: ");
        int umur = input.nextInt();

        if (umur >= 18){
            System.out.println("DEWASA");
        } else {
            System.out.println("BELUM DEWASA");
        }
    input.close();
    }
}