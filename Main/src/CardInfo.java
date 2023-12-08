// cardNo에 맞춰서 name이랑 tribe 출력용도
// 징검다리의 역할
public class CardInfo {
	int cardNo;
	String tribe;
	String name;
	
	public CardInfo(int cardNo, String name, String tribe) {
		this.cardNo = cardNo;
		this.tribe = tribe;
		this.name = name;
	}
	
	public String toString() {
		return "CardNo." + cardNo + ", Name = " + name +
				", Tribe = " + tribe;
	}
	
	public String getTribe() {
		return tribe;
	}
	public String getName() {
		return name;
	}
	public int getCardNo() {
		return cardNo;
	}

	public void setTribe(String tribe) {
		this.tribe = tribe;
	}
	public void setAttack(String name) {
		this.name = name;
	}
	public void setDefense(int cardNo) {
		this.cardNo = cardNo;
	}
}
