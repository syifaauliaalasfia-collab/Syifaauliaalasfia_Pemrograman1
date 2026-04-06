import java.text.*;
import java.util.*;

public class FormatAngkaLokal 
{
    public static void main(String args[]) 
    {
        double Angka = 83243463.342245;
        double AngkaPecahan = 0.902235643;

        // Format lokal Jerman
        NumberFormat NumberFormatterGERMANY = NumberFormat.getNumberInstance(Locale.GERMANY);
        NumberFormat CurrFormatterGERMANY = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        NumberFormat PercentFormatterGERMANY = NumberFormat.getPercentInstance(Locale.GERMANY);

        System.out.println("=== Format Locale.GERMANY ===");
        System.out.println("number   : " + NumberFormatterGERMANY.format(Angka));
        System.out.println("currency : " + CurrFormatterGERMANY.format(Angka));
        System.out.println("percent  : " + PercentFormatterGERMANY.format(AngkaPecahan));

        // Format lokal Amerika
        NumberFormat NumberFormatterUS = NumberFormat.getNumberInstance(Locale.US);
        NumberFormat CurrFormatterUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat PercentFormatterUS = NumberFormat.getPercentInstance(Locale.US);

        System.out.println("\n=== Format Locale.US ===");
        System.out.println("number   : " + NumberFormatterUS.format(Angka));
        System.out.println("currency : " + CurrFormatterUS.format(Angka));
        System.out.println("percent  : " + PercentFormatterUS.format(AngkaPecahan));
    }
}
