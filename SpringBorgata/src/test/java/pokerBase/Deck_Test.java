package pokerBase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Deck_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestFullDeck() {
		int iDeckSize = 54;
		Deck d = new Deck(2);
		assertTrue(d.getTotalCards() == iDeckSize);		
	}
	
	@Test
	public void DrawOne() {
		int iDeckSize = 56;
		int iDeckSizeDrawOne = 55;
		
		Deck d = new Deck(4);
		assertTrue(d.getTotalCards() == iDeckSize);
		d.drawFromDeck();
		
		assertTrue(d.getTotalCards() == iDeckSizeDrawOne);
		
	}
	

}
