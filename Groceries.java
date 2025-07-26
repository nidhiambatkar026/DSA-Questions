import java.util.Scanner;

public class Groceries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();//no of items
            int x = scanner.nextInt();//minimum freshnes value an item should have
            int item =0;
            int[] a = new int[n];//freshness values of each item
            int[] b = new int[n];//cost of each item
            
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            for (int j = 0; j < n; j++) {
                b[j] = scanner.nextInt();
            }
            
            for(int k=0; k<a.length; k++){
                if(a[k] >= x){
                   item = item + b[k];
                }
            }
            System.out.println(item); 
    }
}
}
