import java.util.*;

public class CountElementsLessThanK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements in the list
        int element_size = scanner.nextInt();

        // Read the elements of the list
        int[] elements = new int[element_size];
        for (int i = 0; i < element_size; i++) {
            elements[i] = scanner.nextInt();
        }

        // Read the integer num (K)
        int num = scanner.nextInt();
        scanner.close();

        // Count elements strictly less than num
        int count = 0;
        for (int element : elements) {
            if (element < num) {
                count++;
            }
        }

        // Print the result
        System.out.println(count);
    }
}
