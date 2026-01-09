import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- DevOps Min/Max Finder ---");
        System.out.print("Enter numbers separated by spaces (e.g., 10 5 20 1): ");
        
        String input = scanner.nextLine();
        try {
            String[] parts = input.split("\\s+");
            int[] numbers = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();

            if (numbers.length == 0) {
                System.out.println("No numbers entered!");
                return;
            }

            int min = Arrays.stream(numbers).min().getAsInt();
            int max = Arrays.stream(numbers).max().getAsInt();

            System.out.println("Result -> Min: " + min + ", Max: " + max);
            System.out.println("Execution successful inside Docker!");
        } catch (Exception e) {
            System.out.println("Error: Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}
