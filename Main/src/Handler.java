

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
	
	public Vector<CardInfo> getAllCardName() {
		for (int i = 0; i < cards.size(); i++) {
			Card cd = cards.get(i);
			for (int j = 0; j < info.size(); j++) {
				Info inf = info.get(i);
				//if (cd.cardNo == inf.cardNo) 
					
			}
		}
		
		return cardInfo;
	}
	
	
	
	
	
	
	
	
	
}


