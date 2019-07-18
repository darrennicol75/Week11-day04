import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.getDeckSize());
    }

    //Test add a card to deck

    @Test
    public void deckHasOneCard(){
        deck.addCardToDeck(card);
        assertEquals(1, deck.getDeckSize());
    }

    //Test for 52 cards

    @Test
    public void deckHas52Cards(){
        deck.addCardsToDeck();
        assertEquals(52, deck.getDeckSize());
    }

    //Tests that the deck is shuffled using the debugger.

    @Test
    public void deckShuffles(){
        deck.addCardsToDeck();
        deck.shuffle();
        assertEquals(52, deck.getDeckSize());
    }



}
