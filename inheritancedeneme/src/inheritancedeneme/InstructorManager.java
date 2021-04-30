package inheritancedeneme;

public class InstructorManager {
	
	public void addCourse(Instructor instructor) {
		System.out.println("egitmen kursu ekleme yapýldý: "+instructor.getFirstName());
		
	}public void addIncructur(Instructor instructor) {
		System.out.println("egitmen eklendi: "+instructor.getFirstName()+ " "+instructor.getLastName());
	}

}
