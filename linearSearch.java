import java.util.Scanner;

public class linearSearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array: ");
        int N = sc.nextInt();
        int array[] = new int[N];

        for(int i=0;i<N;i++){
            array[i]=sc.nextInt();
        }

        System.out.println("Enter the target Element: ");
        int target = sc.nextInt();

        int ans = linearSearch(array, target);
        System.out.println(ans);

        
    }
    static int linearSearch(int arr[] , int target){
        if(arr.length == 0){
           return -1;
        }
        for(int index=0;index<arr.length-1;index++){
            int Element = arr[index];
            if(Element == target){
                return index;
            }
        }
        return -1;
    }
}
