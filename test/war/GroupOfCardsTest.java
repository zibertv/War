package war;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vincent
 */
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        GroupOfCards instance = new GroupOfCards();
        String[] suits = {"CLUBS", "DIAMONDS", "HEARTS", "SPADES"};
        for (Rank rank : Rank.values()) {
            for (String suit: suits) {
                instance.cards.add(new RegularCard(rank, suit, true));
            }
        }
        instance.shuffle();
        GroupOfCards cards = new GroupOfCards();
        for (Rank rank : Rank.values()) {
            for (String suit: suits) {
                cards.cards.add(new RegularCard(rank, suit, true));
            }
        }
        boolean expResult = false;
        boolean result = instance.cards.equals(cards.cards);
        assertEquals(result, expResult);
    }
}
