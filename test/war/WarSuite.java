package war;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Vincent
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({war.GroupOfCardsTest.class, war.WarTest.class, war.WarPlayerTest.class, war.CardTest.class, war.PlayerTest.class, war.RegularCardTest.class, war.MainDeckTest.class, war.GameTest.class})
public class WarSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
