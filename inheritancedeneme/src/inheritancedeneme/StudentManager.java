package inheritancedeneme;

public class StudentManager {
	
	public void add(Student student) {
		System.out.println("�grenci ekleme yap�ld�"+student.getFirstName());
		
	}
	public void showNot(Student student) {
		System.out.println("ogrencinin notu: "+student.getNot());
	}
	
}
