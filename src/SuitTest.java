import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class SuitTest {

	@Test
	public void testSuit() {
		Suit suit = Suit.CLUB;
		Assert.assertEquals(suit, Suit.CLUB);
	}

	@Test
	public void testGetSuit() {
		Suit suit = Suit.getSuit("s");
		Assert.assertEquals(suit, Suit.SPADE);
		suit = Suit.getSuit("h");
		Assert.assertEquals(suit, Suit.HART);
		suit = Suit.getSuit("d");
		Assert.assertEquals(suit, Suit.DIAMOND);
		suit = Suit.getSuit("c");
		Assert.assertEquals(suit, Suit.CLUB);
	}

}
