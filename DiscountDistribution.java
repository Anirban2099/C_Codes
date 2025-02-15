import java.util.Scanner;

public class DiscountDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of products
        int numOfProducts = scanner.nextInt();
        int[] orders = new int[numOfProducts];

        // Read the orders for each product
        for (int i = 0; i < numOfProducts; i++) {
            orders[i] = scanner.nextInt();
        }

        // Read the discount amount
        int disAmount = scanner.nextInt();
        scanner.close();

        // Compute and print the result
        System.out.println(countEligibleProducts(numOfProducts, orders, disAmount));
    }

    public static int countEligibleProducts(int numOfProducts, int[] orders, int disAmount) {
        int count = 0;
        for (int order : orders) {
            if (order > 0 && disAmount % order == 0) {
                count++;
            }
        }
        return count;
    }
}