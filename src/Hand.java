import java.util.ArrayList;
import java.util.List;

/**
 * ��D
 */
public class Hand {
	List<Card> cards = new ArrayList<Card>();
	
	public Hand(List<Card> cards) {
		this.cards = cards;
	}
	
	public Hand() {
	}
	
	/**
	 * ��D�̐�����List���擾����B
	 * @return
	 */
	public List<Integer> getNumberList(){
		List<Integer> numberList = new ArrayList<Integer>();
		for(Card c :cards){
			numberList.add(c.number);
		}
		
		return numberList;
	}
	
	/**
	 * �����񂩂琔���ɕϊ�����
	 * @param s
	 * @return
	 */
	private int getNumber(String s){
		s = s.toUpperCase();
		if(s.equals("A")){
			return 1;
		}else if(s.equals("K")){
			return 13;
		}else if(s.equals("Q")){
			return 12;
		}else if(s.equals("J")){
			return 11;
		}else if(s.equals("T")){
			return 10;
		}else{
			return Integer.parseInt(s);
		}
	}
	
	/**
	 * �J�[�h���ɂ���(*3)(*4)(*5)
	 * 1�����ځF���l (A:�G�[�X 2�`9:���� T:10 J:11 Q:12 K:13)
	 * 2�����ځF�X�[�g(s:�X�y�[�h h:�n�[�g d:�_�C�� c:�N���[�o�[)
	 * @param String card
	 */
	public void drow(String card) {
		//TODO ��O����
		int number = getNumber(card.substring(0 , 1));
		Suit suit = Suit.getSuit(card.substring(1));
		drow(new Card(suit , number));
	}
		
	/**
	 * �J�[�h���ꖇ��D�ɒǉ��B
	 * @param card
	 * @throws Exception 
	 */
	public void drow(Card card) {
		if(cards.size() > 5){
			//��O����
		}
		
		cards.add(card);
	}
	
	@Override
	public String toString() {
		return cards
				+ super.toString();
	}
}
