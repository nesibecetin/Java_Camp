
public class InstructorManager extends UserManager {
	
	@Override
	public void Login(User user) {
		// TODO Auto-generated method stub
		super.Login(user);
	}

	public void createLesson(Instructor instructor) {
		System.out.println("Ders baþarýyla açýldý."+instructor.getLesson());
	}
	
}
