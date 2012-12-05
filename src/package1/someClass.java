package package1;

public class someClass {

	private String name;
	
	public someClass() {
		name = "unknown";
	}
	
	public someClass(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
