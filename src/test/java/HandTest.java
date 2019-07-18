import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HandTest {

    Hand hand;
    Deck deck;

    @Before
    public void before(){
        hand = new Hand();
        deck = new Deck();
    }

    @Test
    public void handStartsEmpty(){
        assertEquals(0, hand.getHandSize());
    }

    @Test
    public void takeCardFromDeck(){
        deck.addCardsToDeck();
        deck.shuffle();
        hand.addCardToHand(deck);
        assertEquals(1, hand.getHandSize());
        assertEquals(51, deck.getDeckSize());
    }

}
