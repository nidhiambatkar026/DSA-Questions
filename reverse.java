import java.util.Arrays;

public class reverse {
    public static void main(String args[]){
        int arr[] = {45, 12, 10, 13, 7};
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed array is: "+Arrays.toString(arr));
    }
}
