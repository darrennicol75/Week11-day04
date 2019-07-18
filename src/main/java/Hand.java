import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }

    public int getHandSize() {
        return this.hand.size();
    }


    public void addCardToHand (Deck deck) {
        Card card = deck.removeCardFromDeck();
        this.hand.add(card);
    }
}
