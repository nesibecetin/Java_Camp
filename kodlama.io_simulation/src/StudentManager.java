
public class StudentManager extends UserManager {
	
	@Override
	public void Login(User user) {
		// TODO Auto-generated method stub
		super.Login(user);
	}

	public void getLesson(Student student) {
		System.out.println("Kurs seçildi:"+ student.getLesson());
	}

}
