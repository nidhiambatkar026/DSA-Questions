import java.util.Scanner;

public class numerologynum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int sum =0;

        for(int i=0; i<word.length();i++){
            int index = i+1;
            int asci = (int)word.charAt(i);
            int product = asci * index;

            if(index % 2 !=0 || asci % 2 !=0){
                sum = sum + product;
            }
        }
        System.out.println(sum);
    }
}
