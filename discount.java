import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // number of items
            int x = scanner.nextInt(); // cost of discount coupon
            int y = scanner.nextInt(); // reduction per item
            int[] a = new int[n];
            int sum = 0, sum2 = 0;

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt(); // input item prices
            }

            // Calculate original total cost
            for (int i = 0; i < n; i++) {
                sum += a[i];
            }
            System.out.println("Sum of Original Cost without buying coupons: " + sum);

            // Show coupon cost
            System.out.println("Cost of coupon is: " + x);
            System.out.println("Does Customer Buy the coupon? (Yes/No): ");
            String ans = scanner.next();

            if (ans.equalsIgnoreCase("Yes")) {
                // Apply discount correctly
                for (int i = 0; i < n; i++) {
                    int discounted = a[i] - y;
                    if (discounted < 0) discounted = 0;
                    sum2 += discounted;
                }

                System.out.println("Sum of all items after buying the coupon: " + sum2);
                int totalCost = x + sum2;
                System.out.println("Total cost if buying with coupon: "+totalCost);

                if (totalCost < sum) {
                    System.out.println("COUPON");
                } else {
                    System.out.println("NO COUPON");
                }

            } else {
                System.out.println("Customer does not purchase the coupon");
            }
        }
    }
}
