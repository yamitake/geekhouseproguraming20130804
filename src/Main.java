
public class Main {
	public static void main(String[] args) {
		if(args.length != 5 ){
			System.out.println("�����͂T��");
		}
		
		Hand hand = new Hand();
		for(String s:args){
			hand.drow(s);
		}
		
		System.out.print(HandJadge.besetHand(hand));
	}
}
