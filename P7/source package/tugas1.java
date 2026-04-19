//TUGAS membuat if else
import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        System.out.print("Masukan umur :");
        int umur = input.nextInt();

        String status;  
        if (umur >= 18){
            status ="DEWASA";
        } else {
            status = "BELUM DEWASA";
        }

        System.out.println("Umur kamu : " + umur);
        System.out.println("Status :" + status );

        input.close();
    }
}
