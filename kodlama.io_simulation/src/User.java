
public class User {
	private int id;
	private String Name;
	private String Surname;
	private String Lesson;
	
	public User(int id, String name, String surname, String lesson) {
		super();
		this.id = id;
		Name = name;
		Surname = surname;
		Lesson = lesson;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getLesson() {
		return Lesson;
	}
	public void setLesson(String lesson) {
		Lesson = lesson;
	}
	
}
