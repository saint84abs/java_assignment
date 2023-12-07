// info에 저장되는 정보는 카드 하단의 정보 | 
// 속성, 종족번호, 종족
// cardNo로 card에서 이어짐
public class Info {
	int cardNo;
	int attack;
	int defense;
	String tribe;
	
	public Info(int cardNo, int attack, int defense, String tribe) {
		super();
		this.cardNo = cardNo;
		this.attack = attack;
		this.defense = defense;
		this.tribe = tribe;
	}
	
	public String toString() {
		return "CardNo = " + cardNo + ", name = " + name +
				", tribe = " + tribe;
	}
	
	public int getCardNo() {
		return cardNo;
	}
	public String getName() {
		return name;
	}
	public String getTribe() {
		return tribe;
	}
	
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public void setTribeNo(String tribe) {
		this.tribe = tribe;
	}
	public void setCardCnt(String name) {
		this.name = name;
	}
}
