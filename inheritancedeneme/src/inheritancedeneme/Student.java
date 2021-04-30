package inheritancedeneme;

public class Student extends User{
	private String classroom;
	private double not;
	private double vize;
	private double sonvize;
	
	public Student() {
		
	}
	
	public Student(String classroom, double not, double vize, double sonvize) {
		this();
		this.classroom = classroom;
		this.not = not;
		this.vize = vize;
		this.sonvize = sonvize;
	}

	public String getClassroom() {
		return classroom;
	}

	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}

	public double getNot() {
		return ((this.vize*0.3)+(this.sonvize*0.7));
	}

	

	public double getVize() {
		return vize;
	}

	public void setVize(double vize) {
		this.vize = vize;
	}

	public double getSonvize() {
		return this.sonvize;
	}
	
	public void setSonVize(double sonvize) {
		this.sonvize = sonvize;
	}
	
	
}
