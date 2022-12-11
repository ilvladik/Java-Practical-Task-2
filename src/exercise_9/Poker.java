package exercise_9;

import java.util.Scanner;

public class Poker {

    public static void main(String[] args) {
        final byte MAX_PLAYER = 10;
        final byte CARD_PER_PLAYER = 5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of players: ");
        byte countPlayers = scanner.nextByte();
        if (countPlayers <= MAX_PLAYER) {
            Deck deck = new Deck();
            deck.shuffle();
            for (int i = 0; i < countPlayers; i++) {
                System.out.println("Player №" + (i+1));
                for (int j = 0; j < CARD_PER_PLAYER; j++) {
                    System.out.println(deck.getCard());
                }
                System.out.println();
            }
        } else {
            System.out.println("There are too many players");
        }
    }
}
