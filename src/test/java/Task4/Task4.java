package Task4;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sheiyvane Dolari: ");
        double usd = scanner.nextDouble();

        double rate = 1.2;

        double fee = 2;

        double eurReceived = usd * rate * (1 - fee / 100);
        System.out.println("EUR received: " + eurReceived);
    }
}
