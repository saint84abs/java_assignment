// 유희왕 카드 정보 : 이름, 속성, 레벨, 종족, (효과), 공격력, 방어력

public class Card {
	String name;
	int level;
	int tribeNo;
	int attack;
	int defense;
	
	public Card(String name, int level, int tribeNo, int attack, int defense) {
		super();
		this.name = name;
		this.level = level;
		this.tribeNo = tribeNo;
		this.attack = attack;
		this.defense = defense;
	}
	
	public String toString() {
		return "Name = " + name + ", level = " + level + 
				", tribe = " + tribeNo + ", attack = " + attack + 
				", defense = " + defense;
	}
	
	public String getName() {
		return name;
	}
	public int getLevel() {
		return level;
	}
	public int getTribe() {
		return tribeNo;
	}
	public int getAttack() {
		return attack;
	}
	public int getDefense() {
		return defense;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void setTribe(int tribeNo) {
		this.tribeNo = tribeNo;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
}
