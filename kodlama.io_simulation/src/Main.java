
public class Main {

	public static void main(String[] args) {
		Student student = new Student(1,"nesibe","Çetin","Java&React",123);
		Instructor instructor = new Instructor(2,"Engin","Demiroğ","Java&React");
		StudentManager studentmanager=new StudentManager();
		InstructorManager instructormanager=new InstructorManager();
		studentmanager.getLesson(student);
		instructormanager.createLesson(instructor);
		UserManager userManager=new UserManager();
		userManager.Login(student);
		userManager.Login(instructor);
	}

}
