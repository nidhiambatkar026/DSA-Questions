/*You are given control of a retro game controller which has 6 buttons each represented by a 6-bit integer value.
 * Each bit indicates whether a button is pressed or unpressed by 1 and 0 respectively.
 * When party Mode is activated , the 1st , 3rd, and 5th bits, counting from the right toggle their state from 0 to 1 and 1 to 0. Your task is to find and return an integer value representing the new button state after applying the party Mode.
*/

import java.util.Scanner;

public class toggleBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String bString = Integer.toBinaryString(input);

        char bits[] = bString.toCharArray();
        int n = bits.length;

        flip(bits, n-1);
        flip(bits, n-3);
        flip(bits, n-5);

        String revString = String.valueOf(bits);//valueOf method is method of wrapper class and it is use to convert one dataype into object of another datatype
        int result = Integer.parseInt(revString, 2);

        System.out.println(result);
        
    }
    private static void flip(char bits[], int index){
        if(bits[index] == '0'){
            bits[index] = '1';
        }
        else{
            bits[index] = '0';
        }
    }

}
