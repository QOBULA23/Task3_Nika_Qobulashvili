package Task5;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[5];
        double[] weights = new double[5];
        double weightedSum = 0;
        double totalWeight = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Input Score " + (i + 1) + ": ");
            scores[i] = scanner.nextDouble();
            System.out.print("Input Score Weight " + (i + 1) + ": ");
            weights[i] = scanner.nextDouble();

            weightedSum += scores[i] * weights[i];
            totalWeight += weights[i];
        }

        double weightedAverage = weightedSum / totalWeight;
        System.out.println("Weighted Average: " + weightedAverage);
    }
}
