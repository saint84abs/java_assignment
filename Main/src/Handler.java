

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
			Card cd = (Card)cards.get(i);
			for (int j = 0; j < info.size(); j++) {
				Info inf = (Info)info.get(j);
				if (cd.cardNo == inf.cardNo)
					cardInfo.add(new CardInfo(cd.cardNo, cd.name, inf.tribe));
			}
		}
		return cardInfo;
	}
	
	// 원하는 카드의 이름을 입력하면 그 카드의 이름과 종족을 리턴
	public Vector<CardInfo> getInfoOfCard(String name) {
		for (int i = 0; i < cards.size(); i++) {
			Card cd = cards.get(i);
			for (int j = 0; j < info.size(); j++) {
				Info inf = info.get(j);
				if (cd.name == name && cd.cardNo == inf.cardNo) {
					cardInfo.add(new CardInfo(cd.cardNo, cd.name, inf.tribe));
				}
			}
		}
		return cardInfo;
	}
}


