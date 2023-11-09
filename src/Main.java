import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Part a
        int[] dataPoints = new int[100];

        // Part b
        Random random = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1;
        }

        // Part c
        System.out.print("Data Points: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println();

        // Part d
        int sum = 0;
        for (int value : dataPoints) {
            sum += value;
        }

        double average = (double) sum / dataPoints.length;

        System.out.println("Sum of data points: " + sum);
        System.out.printf("The average of the random array dataPoints is: %.2f%n", average);
    }
}
