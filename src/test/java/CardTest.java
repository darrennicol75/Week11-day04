import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(RankType.ACE, card.getRank());
    }

    @Test
    public void aceHasAValue10(){
        assertEquals(1, card.getValueFromEnum());
    }
//
// Demo of why enums can be helpful
//
//    @Test
//    public void suitCanBeMispelled() {
//        card = new Card("Heeaarts");
//        assertEquals("Heeaarts", card.getSuit());
//    }
//
//    @Test
//    public void suitCanBeBananas() {
//        card = new Card("Bananas");
//        assertEquals("Bananas", card.getSuit());
//    }
//
// Strings are great as can be changed as above this is
// where enums come in



}
