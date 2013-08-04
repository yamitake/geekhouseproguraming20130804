import java.util.ArrayList;
import java.util.List;

/**
 * 手札
 */
public class Hand {
	List<Card> cards = new ArrayList<Card>();
	
	public Hand(List<Card> cards) {
		this.cards = cards;
	}
	
	public Hand() {
	}
	
	/**
	 * 手札の数字のListを取得する。
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
	 * 文字列から数字に変換する
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
	 * カード情報について(*3)(*4)(*5)
	 * 1文字目：数値 (A:エース 2～9:数字 T:10 J:11 Q:12 K:13)
	 * 2文字目：スート(s:スペード h:ハート d:ダイヤ c:クローバー)
	 * @param String card
	 */
	public void drow(String card) {
		//TODO 例外処理
		int number = getNumber(card.substring(0 , 1));
		Suit suit = Suit.getSuit(card.substring(1));
		drow(new Card(suit , number));
	}
		
	/**
	 * カードを一枚手札に追加。
	 * @param card
	 * @throws Exception 
	 */
	public void drow(Card card) {
		if(cards.size() > 5){
			//例外処理
		}
		
		cards.add(card);
	}
	
	@Override
	public String toString() {
		return cards
				+ super.toString();
	}
}
