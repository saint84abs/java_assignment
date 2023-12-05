
public class Info {
	String property;
	String tribe;
	int tribeNo;
	
	Info(String property, String tribe, int tribeNo) {
		this.property = property;
		this.tribe = tribe;
		this.tribeNo = tribeNo;
	}
	
	public String toString() {
		return "Property = " + property +
				", Tribe = " + tribe + ", TribeNo = " + tribeNo;
	}

	public String getProperty() {
		return property;
	}
	public String getTribe() {
		return tribe;
	}
	public int tribeNo() {
		return tribeNo;
	}
	
	public void setProperty(String property) {
		this.property = property;
	}
	public void setTribe(String tribe) {
		this.tribe = tribe;
	}
	public void setTribeNo(int tribeNo) {
		this.tribeNo = tribeNo;
	}
}
