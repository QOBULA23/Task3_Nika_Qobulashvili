package Task2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sheiyvane Radiusi: ");
        double r = scanner.nextDouble();

        System.out.print("Sheiyvane Heigh: ");
        double h = scanner.nextDouble();

        System.out.print("Sheiyvane Slant heigh: ");
        double s = scanner.nextDouble();

        double surfaceArea = Math.PI * r * (r + s);
        double volume = (1.0 / 3) * Math.PI * r * Math.pow(r, 2) * h;

        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);
    }
}
