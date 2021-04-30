package inheritancedeneme;

public class Instructor extends User {
	
	
	private String brans;
	private String courseName;
	
	public Instructor() {
		
	}
	public Instructor(String brans, String courseName) {
		super();
		this.brans = brans;
		this.courseName = courseName;
	}
	
	public String getBrans() {
		return brans;
	}
	public void setBrans(String brans) {
		this.brans = brans;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
	
}
