package inheritancedeneme;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setId(10);
		student.setFirstName("Bugra");
		student.setClassroom("java");
		student.setUserName("cýlgýnserseri");
		student.setPassWord("123");
		student.setVize(20);
		student.setSonVize(80);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.showNot(student);
		
		
		User user = new User();
		user.setId(1);
		user.setFirstName("Engin");
		user.setLastName("Demirog");
		user.setUserName("KÝNG");
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setCourseName("ALL IN ONE");
		instructor.setCourseName("JAVA");
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setUserName("KING");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor);
		instructorManager.addIncructur(instructor);
		
		
		
		

	}

}
