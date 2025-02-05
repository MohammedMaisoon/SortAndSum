import java.util.Arrays;
import java.util.Scanner;
public class SortAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sorted numbers: " + Arrays.toString(numbers));
        System.out.println("Sum of numbers: " + sum);
        scanner.close();
    }
}