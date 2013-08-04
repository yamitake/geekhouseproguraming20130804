public enum Suit{
	SPADE("s") ,
	HART("h"),
	DIAMOND("d"),
	CLUB("c");
	
	
	private String short_name;
	Suit(String short_name){this.short_name = short_name; }
	
	/**
	 * ƒVƒ“ƒOƒ‹‚Ì•¶Žš—ñ‚©‚çŠG•¿‚ð”»’è
	 * @param suit
	 * @return Suit
	 */
	public static Suit getSuit(String suit){
		for(Suit s :Suit.values()){
			if(s.short_name.equals(suit)){
				return s;
			}
		}
		
		return null;
	}
}