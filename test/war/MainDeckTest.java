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
public class MainDeckTest {
    
    public MainDeckTest() {
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
     * Test of dealCards method, of class MainDeck.
     */
    @Test
    public void goodTestDealCards() {
        System.out.println("gooddealCards");
        ArrayList<Card> deckOne = new ArrayList<>();
        ArrayList<Card> deckTwo = new ArrayList<>();
        MainDeck instance = new MainDeck();
        instance.dealCards(deckOne, deckTwo);
        boolean expResult = true;
        boolean result = (deckOne.size() == deckTwo.size()) ? true : false;
        assertEquals(expResult, result);
    }
    @Test
    public void badTestDealCards() {
        System.out.println("baddealCards");
        ArrayList<Card> deckOne = new ArrayList<>();
        ArrayList<Card> deckTwo = new ArrayList<>();
        ArrayList<Card> deckThree = new ArrayList<>();
        MainDeck instance = new MainDeck();
        instance.dealCards(deckOne, deckTwo);
        boolean expResult = false;
        boolean result = (deckOne.size() == deckThree.size()) ? true : false;
        assertEquals(expResult, result);
    }
}
