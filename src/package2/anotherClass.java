package package2;

public class anotherClass {

	
	private Long ID;
	
	
	public anotherClass() {
		ID = (long) Math.random();
	}
	
	public anotherClass(Long ID){
		this.ID = ID;
	}
	
	public void setID(Long iD) {
		ID = iD;
	}
	
	public Long getID() {
		return ID;
	}
}
