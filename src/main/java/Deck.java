import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<Card>();
    }

    public int getDeckSize() {
        return this.deck.size();
    }


    public void addCardToDeck(Card card) {
        this.deck.add(card);
    }


    public void addCardsToDeck() {
        for (SuitType suitType : SuitType.values()){
            for (RankType rankType : RankType.values()){
                Card card = new Card( suitType, rankType );
                this.deck.add(card);
            }
        }
    }


    public void shuffle(){
        Collections.shuffle(deck);
    }





}
