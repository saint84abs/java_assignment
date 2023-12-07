import java.util.Vector;

public class CardInformation {
	String card[][] = {
			{"1", "블랙 매지션", "8", "어둠"},
			{"2", "푸른 눈의 백룡", "8", "빛"},
			{"3", "블랙 매지션 걸", "5", "어둠"}
	};
	String info[][] = {
			{"2", "드래곤족", "3000", "2500"},
			{"1", "마법사족", "2500", "2000"},
			
			{"3", "마법사족", "1800", "1500"}
	};
	
	Handler MyHandler;
	
	public CardInformation() {
		MyHandler = new Handler();
		
		for (int i = 0; i < card.length; i++) {
			MyHandler.addCard(new Card(Integer.parseInt(card[i][0]), card[i][1], Integer.parseInt(card[i][2]), card[i][3]));
		}
		for (int i = 0; i < info.length; i++) {
			MyHandler.addInfo(new Info(Integer.parseInt(info[i][0]), info[i][1], Integer.parseInt(info[i][2]), Integer.parseInt(info[i][3])));
		}
		
		Vector<Card> cards = MyHandler.getAllCard();
		printVectorContents("getAllCard()", cards);
		
		Vector<Info> inf = MyHandler.getAllInfo();
		printVectorContents("getAllInfo", inf);
		
		// 왜 3번 출력되지?
		Vector<CardInfo> cdinf = MyHandler.getAllCardNameWithTribe();
		printVectorContents("getAllCardNameWithTribe", cdinf);
	}
	
	
	
	public static void main(String args[]) {
		new CardInformation();
	}
	
	public void printVectorContents(String header, Vector v) {
		System.out.println("\n* "+ header );
		for (int i = 0; i < v.size(); i++) {
			Object obj = v.get(i);
			System.out.println(obj.toString());
		}
	}
	
}
