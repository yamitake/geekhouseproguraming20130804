import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class HandTest {

	@Test
	public void test() {
		Hand hand = new Hand();
		
	}
	
	@Test
	public void testDrow(){
		Hand hand = new Hand();
		hand.drow("Ac");
		
		Assert.assertEquals(hand.cards.size(), 1);
		Assert.assertEquals(hand.cards.get(0).suit, Suit.CLUB);
		
		hand.drow("9s");
		
		Assert.assertEquals(hand.cards.size(), 2);
		Assert.assertEquals(hand.cards.get(1).suit, Suit.SPADE);
	}
}
