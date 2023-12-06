// 유희왕 카드 정보 : 이름, 속성, 레벨, 종족, (효과), 공격력, 방어력, 종류
// card에 저장되는 정보는 카드 상단의 정보 | 
// 카드 번호, 이름, 레벨, 속성 
// cardNo로 Info로 이어짐
public class Card {
	int cardNo;
	String name;
	int level;
	String property;
	
	public Card(int cardNo, String name, int level, String property) {
		super();
		this.cardNo = cardNo;
		this.name = name;
		this.level = level;
		this.property = property;
	}
	
	public String toString() {
		return 	"CardNo. = " + cardNo + ", Name = " + name + 
				", level = " + level;
	}
	
	public int getCardNo() {
		return cardNo;
	}
	public String getName() {
		return name;
	}
	public int getLevel() {
		return level;
	}
	public String getProperty() {
		return property;
	}
	
	public void setCardNo(int num) {
		this.cardNo = num;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void setProperty(String property) {
		this.property = property;
	}
}
