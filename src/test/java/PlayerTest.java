import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Hand kennysHand;
    Deck deck;

    @Before
    public void before(){
        kennysHand = new Hand();
        player = new Player("Kenny Rogers", kennysHand);
        deck = new Deck();
    }

    @Test
    public void canGetName(){
        assertEquals("Kenny Rogers", player.getName());
    }

    @Test
    public void canGetHand(){
        deck.addCardsToDeck();
        deck.shuffle();
        kennysHand.addCardToHand(deck);
        player.getHand();
        assertEquals( 1, player.getHand().getHandSize());
    }
}
