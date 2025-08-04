import java.util.Scanner;

public class searchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array and number of queries
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int A[] = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        // Process each query
        for (int q = 0; q < Q; q++) {
            int target = sc.nextInt();
            int index = searchInsert(A, target);
            System.out.println(index);
        }

        sc.close();
    }

    // Binary Search function
    public static int searchInsert(int[] A, int target) {
        int start = 0, end = A.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (A[mid] == target) {
                return mid;
            } else if (target < A[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // If not found, 'start' is the insert position
        return start;
    }
}
