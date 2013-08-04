import junit.framework.Assert;

import org.junit.Test;


public class CardTest {

	@Test
	public void testCard() {
		Card card = new Card(Suit.CLUB , 4);
		
		Assert.assertEquals(card.number, 4);
		Assert.assertEquals(Suit.CLUB, card.suit);
	}

}
