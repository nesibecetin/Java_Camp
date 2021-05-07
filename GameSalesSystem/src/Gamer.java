
public class Gamer {
	int id;
	private String nationalityId;
	private String firstName;
	private String LastName;
	private int yearOfBirthday;
	
	
	public Gamer() {
		
	}

	public Gamer(int id, String nationalityId, String firstName, String lastName, int yearOfBirthday) {
		
		this.id = id;
		this.nationalityId = nationalityId;
		this.firstName = firstName;
		LastName = lastName;
		this.yearOfBirthday = yearOfBirthday;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getYearOfBirthday() {
		return yearOfBirthday;
	}
	public void setYearOfBirthday(int yearOfBirthday) {
		this.yearOfBirthday = yearOfBirthday;
	} 
	
}
