// cardNo에 맞춰서 name이랑 tribe 출력용도
// 징검다리의 역할
public class CardInfo {
	String tribe;
	int attack;
	int defense;
	
	public CardInfo(String tribe, int attack, int defense) {
		this.tribe = tribe;
		this.attack = attack;
		this.defense = defense;
	}
	
	public String getTribe() {
		return tribe;
	}
	public int getAttack() {
		return attack;
	}
	public int getDefense() {
		return defense;
	}

	public void setTribe(String tribe) {
		this.tribe = tribe;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
}
