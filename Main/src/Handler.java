

import java.util.*;

public class Handler {
	Vector <Card>cards;
	Vector <Info>info;
	Vector <CardInfo>cardInfo;

	public Handler() {
		cards = new Vector<Card>();
		info = new Vector<Info>();
		cardInfo = new Vector<CardInfo>();
	}
	
	public void addCard(Card c) {
		cards.add(c);
	}
	public void addInfo(Info i) {
		info.add(i);
	}
	public void addCardInfo(CardInfo ci) {
		cardInfo.add(ci);
	}
	
	public Vector<Card> getAllCard() {
		return cards;
	}
	public Vector<Info> getAllInfo() {
		return info;
	}
	public Vector<CardInfo> getAllCardInfo() {
		return cardInfo;
	}
	
	// 카드의 이름과 종족을 카드번호와 함께 리턴
	public Vector<CardInfo> getAllCardNameWithTribe() {
		for (int i = 0; i < cards.size(); i++) {
			Card cd = cards.get(i);
			for (int j = 0; j < info.size(); j++) {
				Info inf = info.get(i);
				if (cd.cardNo == inf.cardNo)
					cardInfo.add(new CardInfo(cd.cardNo, cd.name, inf.tribe));
			}
		}
		return cardInfo;
	}
	
	public Vector<Info> getInfoOfCard(String name) {
		boolean found = false;
		
		for (int i = 0; i < cards.size(); i++) {
			found = false;
			Card cd = cards.get(i);
			for (int j = 0; j < info.size(); j++) {
				Info inf = info.get(i);
				
			}
		}
		
		return info;
	}
	
	
	
	
	
	public int isMax(int A, int B) {
		return A > B ? A : B;
	}
	
	public int isMin(int A, int B) {
		return A < B ? A : B;
	}
	
}


