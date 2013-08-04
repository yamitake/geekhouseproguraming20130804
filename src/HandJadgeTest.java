import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class HandJadgeTest {
	

	@Test
	public void testBesetHand() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFourOfAKind() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetThreeOfAKind() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPairCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsStraight() {
		Hand hand = new Hand();
		hand.drow("2c");
		hand.drow("3h");
		hand.drow("4h");
		hand.drow("5h");
		hand.drow("6h");
		boolean isStraight = HandJadge.isStraight(hand);
		Assert.assertEquals(isStraight, true);
		
		hand = new Hand();
		hand.drow("5s");
		hand.drow("6s");
		hand.drow("7s");
		hand.drow("8s");
		hand.drow("9s");
		isStraight = HandJadge.isStraight(hand);
		Assert.assertEquals(isStraight , false);
		
		hand = new Hand();
		hand.drow("As");
		hand.drow("Js");
		hand.drow("Ts");
		hand.drow("Qs");
		hand.drow("Ks");
		isStraight = HandJadge.isStraight(hand);
		//Assert.assertEquals(isStraight , true);
	}

	@Test
	public void testIsFlauh() {
		Hand hand = new Hand();
		hand.drow("Ac");
		hand.drow("Th");
		hand.drow("3h");
		hand.drow("6h");
		hand.drow("9h");
		boolean isFlush = HandJadge.isFlush(hand);
		Assert.assertEquals(isFlush, false);
		
		hand = new Hand();
		hand.drow("As");
		hand.drow("Ts");
		hand.drow("3s");
		hand.drow("6s");
		hand.drow("9s");
		isFlush = HandJadge.isFlush(hand);
		Assert.assertEquals(isFlush , true);
		
	}

	@Test
	public void testGetHighCards() {
		Hand hand = new Hand();
		hand.drow("Ac");
		hand.drow("Th");
		hand.drow("3h");
		hand.drow("6h");
		hand.drow("9h");
		Card card = HandJadge.getHighCards(hand);
		
		Assert.assertEquals(card.number, 1); //A
		
		hand = new Hand();
		hand.drow("Kc");
		hand.drow("Th");
		hand.drow("3h");
		hand.drow("6h");
		hand.drow("9h");
		Card card1 = HandJadge.getHighCards(hand);
		Assert.assertEquals(card1.number, 13); //
	}

}
