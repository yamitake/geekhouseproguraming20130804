/*
 * ƒJ[ƒh 
 */
public class Card {
	public Suit suit;
	public int number;
	
	public Card(Suit suit , int number) {
		this.suit = suit;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return this.suit.toString() + ":" + number;
	}
}
