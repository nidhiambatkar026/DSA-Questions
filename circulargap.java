import java.util.*;
public class circulargap {

    public static int calculateGap(String s){
           int sum = 0;
           for(int i=0; i<s.length() -1;i++){
            int value1 = s.charAt(i) - 'a' + 1;
            int value2 = s.charAt(i+1) - 'a' + 1;

            int gap = Math.abs(value2 - value1);

            sum = sum  + gap;
           }
           return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.next();
        System.out.println(calculateGap(input1));
    }
}
