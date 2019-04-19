package war;

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
public class CardTest {
    
    public CardTest() {
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
     * Test of compareOrdinal method, of class Card.
     */
    @Test
    public void testCompareOrdinalEqual() {
        System.out.println("compareOrdinalEqual");
        Card card = new RegularCard(Rank.TWO, "Hearts", true);
        Card instance = new RegularCard(Rank.TWO, "Diamonds", false);
        int expResult = 0;
        int result = instance.compareOrdinal(card);
        assertEquals(expResult, result);
    }
    @Test
    public void testCompareOrdinalLessThan() {
        System.out.println("compareOrdinalLessThan");
        Card card = new RegularCard(Rank.QUEEN, "Hearts", true);
        Card instance = new RegularCard(Rank.TWO, "Diamonds", false);
        int expResult = -1;
        int result = instance.compareOrdinal(card);
        assertEquals(expResult, result);
    }
    @Test
    public void testCompareOrdinalEqualGreaterThan() {
        System.out.println("compareOrdinalGreaterThan");
        Card card = new RegularCard(Rank.TWO, "Hearts", true);
        Card instance = new RegularCard(Rank.KING, "Diamonds", false);
        int expResult = 1;
        int result = instance.compareOrdinal(card);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Card instance = new RegularCard(Rank.KING, "CLUBS", false);
        String expResult = "KING OF CLUBS";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
    public class CardImpl extends Card {

        public CardImpl() {
            super(null, "");
        }

        public String toString() {
            return "";
        }
    }
    
}
