// Aadi Patel
// String Methods


import java.util.Scanner;

// this is for decoding the block of code
public class stringMethods {
    public static void main(String[] args) {
        int list[] = {89, 111, 117, 114, 32, 112, 114, 111, 103, 114, 97, 109, 32, 115, 104, 111, 117, 108, 100, 32, 102, 105, 114, 115, 116, 32, 100, 101, 99, 111, 100, 101, 32, 116, 104, 105, 115, 32, 98, 108, 111, 99, 107, 32, 111, 102, 32, 116, 101, 120, 116, 32, 97, 110, 100, 32, 100, 105, 115, 112, 108, 97, 121, 32, 105, 116, 46, 32, 84, 104, 101, 110, 44, 32, 112, 114, 111, 109, 112, 116, 32, 116, 104, 101, 32, 117, 115, 101, 114, 32, 102, 111, 114, 32, 97, 32, 110, 97, 109, 101, 46, 32, 84, 97, 107, 101, 32, 116, 104, 97, 116, 32, 110, 97, 109, 101, 32, 97, 110, 100, 32, 111, 117, 116, 112, 117, 116, 32, 116, 104, 101, 32, 102, 111, 108, 108, 111, 119, 105, 110, 103, 58, 32, 84, 104, 101, 32, 110, 97, 109, 101, 32, 105, 110, 32, 114, 101, 118, 101, 114, 115, 101, 44, 32, 116, 104, 101, 32, 82, 101, 118, 101, 114, 115, 101, 32, 111, 114, 100, 101, 114, 32, 105, 110, 32, 65, 76, 76, 32, 67, 65, 80, 73, 84, 65, 76, 83, 44, 32, 116, 104, 101, 32, 111, 114, 105, 103, 105, 110, 97, 108, 32, 115, 116, 114, 105, 110, 103, 32, 117, 115, 105, 110, 103, 32, 67, 97, 77, 101, 76, 32, 99, 65, 115, 69, 44, 32, 97, 110, 100, 32, 102, 105, 110, 97, 108, 108, 121, 32, 116, 104, 101, 32, 111, 114, 105, 103, 105, 110, 97, 108, 32, 115, 116, 114, 105, 110, 103, 32, 105, 110, 32, 65, 83, 67, 73, 73, 46, 32, 68, 79, 32, 78, 79, 84, 32, 85, 83, 69, 32, 65, 78, 89, 32, 83, 84, 82, 73, 78, 71, 32, 77, 65, 78, 73, 80, 85, 76, 65, 84, 73, 79, 78, 32, 77, 69, 84, 72, 79, 68, 83, 46, 13, 10};
        String txt;
        for (int i : list) {
            txt = Character.toString((char) i);
            System.out.print(txt);
        }

// this will display for you to input a word or prompt you to put a name in
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a word: ");
        String word = scan.nextLine();
        String reverseword = "";
        for (int i = word.length(); i > 0; --i) {
            reverseword += word.charAt(i - 1);
        }
        System.out.print(reverseword);

// this string is for having it in all capitals
        String capital = "";
        for (int i = 0; i < reverseword.length(); i++) {
            int letter = reverseword.charAt(i);
            if(letter > 96 && letter < 123){
                letter -= 32;
            }
            capital += (char)letter;
        }
        System.out.println("");
        System.out.println(capital);

// this string is for having it in ASCII
        String ascii = "";
        for (int i = 0; i < word.length(); i++) {
            ascii += (int) word.charAt(i) + " ";
        }
        System.out.println(ascii);
    }
}
