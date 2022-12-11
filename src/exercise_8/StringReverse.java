package exercise_8;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[] string = scanner.nextLine().toCharArray();
        int length = string.length;
        for (int i = 0; i < length/2; i++) {
            char temp = string[length-i-1];
            string[length-i-1] = string[i];
            string[i] = temp;
        }
        System.out.println(string);
    }
}
