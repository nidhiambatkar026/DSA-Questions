import java.util.Scanner;
import java.util.Arrays;

public class BinarySeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of the array: ");
        int N = sc.nextInt();
        int arr[] = new int[N];

        System.out.println("Enter sorted array elements: ");
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter Target Element: ");
        int target = sc.nextInt();

        int lb = 0, ub = arr.length - 1;
        int mid = -1;
        boolean found = false;

        while(lb <= ub) {
            mid = lb + (ub - lb) / 2;

            if(arr[mid] == target) {
                found = true;
                break;
            } else if(arr[mid] < target) {
                lb = mid + 1;
            } else {
                ub = mid - 1;
            }
        }

        if(found) {
            System.out.println(target + " found at position " + (mid + 1));
        } else {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
