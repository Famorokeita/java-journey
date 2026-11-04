import java.util.Scanner;


public class CurrencyConverter {
    public static void main (String[] args) {
        System.out.println("===Currency Converter ===");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in EUR: ");
        double euros = scanner.nextDouble();
        double gnfRate = 10000;
        double gnfAmount = euros * gnfRate;
        System.out.println(euros + " Eur = " + gnfAmount + " GNF");
    }
}