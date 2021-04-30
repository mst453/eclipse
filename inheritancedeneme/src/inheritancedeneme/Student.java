package inheritancedeneme;

public class Student extends User{
	private String classroom;
	private int not;
	private int vize;
	private int sonvize;
	
	public Student() {
		
	}
	
	public Student(String classroom, int not, int vize, int sonvize) {
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

	

	public int getVize() {
		return vize;
	}

	public void setVize(int vize) {
		this.vize = vize;
	}

	public double getSonvize() {
		return this.sonvize;
	}
	
	public void setSonVize(int sonvize) {
		this.sonvize = sonvize;
	}
	
	
}
