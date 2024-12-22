package extra;

import java.util.Scanner;

public class Ankitatest712 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] output;
        int j =0;
        int testCases = scanner.nextInt();
        output = new int[testCases];
        while (testCases-- > 0) {
            // Read the size of the array
            int count = scanner.nextInt();

            // Read the elements of the array
            int[] values = new int[count];
            for (int i = 0; i < count; i++) {
                values[i] = scanner.nextInt();
            }

            // Calculate the sum of elements with different parity from their position
            int sum = 0;
            for (int i = 1; i <=count; i++) {
                if (values[i-1] % 2 != i % 2) {
                    sum += values[i-1];
                }
            }

            // Print the result for the current test case
            output[j] = sum;
            j++;
        }

        for(int x:output)
            System.out.println(x);
        scanner.close();
    }
}
