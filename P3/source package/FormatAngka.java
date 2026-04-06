import java.text.*;

public class FormatAngka 
{
    public static void main(String args[]) 
    {
        double Angka = 83243463.342245;
        double AngkaPecahan = 0.902235643;

        NumberFormat NumberFormatter = NumberFormat.getNumberInstance();
        NumberFormat CurrFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat PercentFormatter = NumberFormat.getPercentInstance();

        // Format default
        System.out.println("double Angka = " + Angka + " berformat number : " + NumberFormatter.format(Angka));
        System.out.println("double Angka = " + Angka + " berformat currency : " + CurrFormatter.format(Angka));
        System.out.println("double Angka = " + AngkaPecahan + " berformat percent : " + PercentFormatter.format(AngkaPecahan));

        System.out.println();
        
        // Set pengaturan format
        NumberFormatter.setMaximumFractionDigits(5);
        CurrFormatter.setMaximumFractionDigits(2);
        PercentFormatter.setMaximumFractionDigits(4);

        System.out.println("double Angka = " + Angka + " berformat number : " + NumberFormatter.format(Angka));
        System.out.println("double Angka = " + Angka + " berformat currency : " + CurrFormatter.format(Angka));
        System.out.println("double Angka = " + AngkaPecahan + " berformat percent : " + PercentFormatter.format(AngkaPecahan));
    }
}
