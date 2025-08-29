/*you are given Sentence S, and your task is to find and return a string value representing the longest word in S that has even length and starts with vowel(case insensitive).
 If no such word exists, return "00";
*/

import java.util.Scanner;

public class largestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String words[] = sentence.split("\\s+");

        String result = "00";
        int maxlength = 0;

        for(int i=0; i<words.length;i++){
           String Sent = words[i];
           int len = Sent.length();
           char ch = Character.toLowerCase(Sent.charAt(0));

           if((len % 2 == 0) && (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')){
            if(len > maxlength){
                maxlength = len;
                result = Sent;
            }
           }
        }
        System.out.println(result);
    }
}
