import java.util.Collections;
import java.util.List;


/**
 * hand �����D�𔻒肷��
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
	 * �y�A����Ԃ��B
	 */
	public static int getPairCount(Hand hand){
		List<Integer> numberList = hand.getNumberList();
		return 0;
	}
	
	/**
	 * �X�g���[�g�̐^�U
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
		//TODO 13->1�̏ꍇ���l����
		
		return false;
	}
	
	/**
	 * �t���b�V���̐^�U
	 * @param hand
	 * @return
	 */
	public static boolean isFlush(Hand hand){
		Suit suit = hand.cards.get(0).suit;
		for(Card card: hand.cards){
			if(suit == card.suit){
				
			}else{
				//�X�[�g�������Ă��Ȃ�
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * ��D����ő�l�̎D�𓾂� A���ŋ�
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
			
			//A�ŋ�
			if(card.number == 1){
				highCard = card;
				break;
			}
			
			//�X�[�g������H
		}
		
		return highCard;
	}
	
}
