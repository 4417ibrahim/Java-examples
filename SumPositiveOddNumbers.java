import java.util.Scanner;

public class SumPositiveOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Input: elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        // Sum only positive odd numbers
        for (int num : array) {
            if (num > 0 && num % 2 != 0) {
                sum += num;
            }
        }

        System.out.println("Sum of positive odd numbers: " + sum);
    }
}
