package inheritancedeneme;

public class InstructorManager {
	
	public void addCourse(Instructor instructor) {
		System.out.println("egitmen kursu ekleme yap�ld�: "+instructor.getFirstName());
		
	}public void addIncructur(Instructor instructor) {
		System.out.println("egitmen eklendi: "+instructor.getFirstName()+ " "+instructor.getLastName());
	}

}
