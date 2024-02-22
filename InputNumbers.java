import java.util.Scanner;

public class InputNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        double[] numbers = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextDouble();
        }

        System.out.println("\nInput numbers:");
        for (double num : numbers) {
            System.out.println(num);
        }

        input.close();
    }
}
