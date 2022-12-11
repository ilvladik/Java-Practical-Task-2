package exercise_9;

public class Card {

    private final CardType type;

    public Card(CardType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type.toString();
    }
}
