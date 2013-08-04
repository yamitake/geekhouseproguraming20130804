import java.util.Collections;
import java.util.List;


/**
 * hand から手札を判定する
 * "straight flash"
 * "four of a kind"
 * "full house"
 * "flush"
 * "straight"
 * "three of a kind"
 * "two pair"
 * "one pair"
 * "high cards"
 */
public class HandJadge {

	public static String besetHand(Hand hand){
		
		
		return null;
	}
	
	public static String isFullHouse(Hand hand){
		return null;
	}
	
	public static boolean getFourOfAKind(Hand hand){
		
		return false;
	}
	
	public static boolean getThreeOfAKind(Hand hand){
		
		return false;
	}
	
	/**
	 * ペア数を返す。
	 */
	public static int getPairCount(Hand hand){
		List<Integer> numberList = hand.getNumberList();
		return 0;
	}
	
	/**
	 * ストレートの真偽
	 */
	public static boolean isStraight(Hand hand){
		List<Integer> numberList = hand.getNumberList();
		Collections.sort(numberList);
		
		int tmp = numberList.get(0);
		for(Integer i : numberList ){
			if(tmp + 1 == i){
				
			}else{
				break;
			}
		}
		//TODO 13->1の場合を考える
		
		return false;
	}
	
	/**
	 * フラッシュの真偽
	 * @param hand
	 * @return
	 */
	public static boolean isFlush(Hand hand){
		Suit suit = hand.cards.get(0).suit;
		for(Card card: hand.cards){
			if(suit == card.suit){
				
			}else{
				//スートが揃っていない
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * 手札から最大値の札を得る Aが最強
	 * @param hand
	 * @return
	 */
	public static Card getHighCards(Hand hand){
		int max = 0;
		Card highCard = null;
		for(Card card: hand.cards){
			if(card.number > max){
				max = card.number;
				highCard = card;
			}
			
			//A最強
			if(card.number == 1){
				highCard = card;
				break;
			}
			
			//スートを見る？
		}
		
		return highCard;
	}
	
}
