import java.util.Scanner;

public class mismatched {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int Mismatch = 0;

        for(int i=0;i<N/2;i++){
            if(S.charAt(i) != S.charAt(N-i-1)){
                Mismatch++;
            }
        }
        System.out.println(Mismatch);
    }
}
