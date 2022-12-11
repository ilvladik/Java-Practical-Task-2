package exercise_10;

import java.util.Scanner;

public class HowMany {

    public static void main(String[] args) {

        final String letters = "qwertyuiopasdfghjklzxcvbnmйцукенгшщзхъфывапролджэёячсмитьбю";
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int count = 0;
        boolean isLetterBef = false;
        for (int i = 0; i < line.length(); i++) {
            if (letters.contains(line.substring(i, i+1))) {
                isLetterBef = true;
                if (i == line.length() - 1) {
                    count++;
                }
            } else {
                if (isLetterBef) {
                    count++;
                }
                isLetterBef = false;
            }
        }
        System.out.println(count);
    }
}
