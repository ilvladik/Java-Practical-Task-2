package exercise_9;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Deck {
    private final Stack<Card> cards;

    public Deck() {
        cards = new Stack<>();
        Arrays.stream(CardType.values()).forEach(cardType -> cards.add(new Card(cardType)));
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card getCard() {
        return cards.pop();
    }

    int getNumberOfCards() {
        return cards.size();
    }
}
