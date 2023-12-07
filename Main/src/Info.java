// info에 저장되는 정보는 카드 하단의 정보 | 
// 속성, 종족번호, 종족
// cardNo로 card에서 이어짐
public class Info {
	int cardNo;
	String tribe;
	int attack;
	int defense;
	
	public Info(int cardNo, String tribe, int attack, int defense) {
		super();
		this.cardNo = cardNo;
		this.tribe = tribe;
		this.attack = attack;
		this.defense = defense;
	}
	
	public String toString() {
		return "CardNo." + cardNo + ", tribe = " + tribe + 
				", attack = " + attack + ", defense = " + defense;
	}
	
	public int getCardNo() {
		return cardNo;
	}
	public int getAttack() {
		return attack;
	}
	public int getDefense() {
		return defense;
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
		this.attack = attack;
	}
}
