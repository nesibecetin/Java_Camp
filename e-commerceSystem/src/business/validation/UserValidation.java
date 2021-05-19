package business.validation;


import java.util.regex.*;
import dataaccess.abstracts.UserDao;
import entities.concretes.User;

public class UserValidation implements UserValidationService{
	
	public static final String regex = "^[A-Z0-9.%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	public Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	UserDao userDao;
	
	public UserValidation() {
		
	}
	@Override
	public boolean validate(User user) {
		
		if (checkFirstName(user.getFirstName()) && checkLastName(user.getLastName()) &&checkEMail(user.getEmail()) && checkPassword(user.getPassword()) ) {
			return true;
		}
		return false;
		
	}
	
	@Override
	public boolean validatelogin(String email, String password) {
		if(email !="" && password!="") {
			return true;
		}else {
			System.out.println("Email and Password Required. ");
			return false;
		}
		
	}
	private boolean checkFirstName(String firstName) {
		if(firstName.length() > 2) {
			
			return true;
		}
		else {
			System.out.println("User's firstName must have at least 2 characters.");
			return false;
		}
	
		
	}
	
	private boolean checkLastName(String lastName) {
		if(lastName.length() >2) {
					
			return true;
		}
		else {
			System.out.println("User's lastName must have at least 2 characters.");
			return false;
		}
		
	}
	
	private boolean checkEMail(String email) {
		if(pattern.matcher(email).find()) {
			return true;
		}
		System.out.println("Invalid e-mail adress.");
		return false;		
	}
	
	
	private boolean checkPassword(String password) {
		if (password.length() > 6){
			return true;	
		}
		else {
			System.out.println("Password must have 6 characters.");
			return false;
		}
			
	}
	
	
	
	
}
