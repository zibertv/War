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
public class RegularCardTest {
    
    public RegularCardTest() {
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
     * Test of isFaceDown method, of class RegularCard.
     */
    @Test
    public void testIsFaceDownTrue() {
        System.out.println("isFaceDownTrue");
        RegularCard instance = new RegularCard(Rank.TWO, "HEARTS", true);
        boolean expResult = true;
        boolean result = instance.isFaceDown();
        assertEquals(expResult, result);
    }
    @Test
    public void testIsFaceDownFalse() {
        System.out.println("isFaceDownFalse");
        RegularCard instance = new RegularCard(Rank.TWO, "HEARTS", false);
        boolean expResult = false;
        boolean result = instance.isFaceDown();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class RegularCard.
     */
    @Test
    public void testToStringGood() {
        System.out.println("toStringGood");
        RegularCard instance = new RegularCard(Rank.TWO, "HEARTS", false);
        String expResult = "TWO OF HEARTS";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    @Test
    public void testToStringBad() {
        System.out.println("toStringBad");
        RegularCard instance = new RegularCard(Rank.TWO, "HEARTS", false);
        boolean expResult = false;
        boolean result = ("KING OF DIAMONDS".equals(instance.toString()));
        assertEquals(expResult, result);
    }    
}
