package Task4;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("20$: ");
        double usd = scanner.nextDouble();

        System.out.print("7: ");
        double rate = scanner.nextDouble();

        System.out.print("5: ");
        double fee = scanner.nextDouble();

        double eurReceived = usd * rate * (1 - fee / 100);
        System.out.println("EUR received: " + eurReceived);
    }
}
