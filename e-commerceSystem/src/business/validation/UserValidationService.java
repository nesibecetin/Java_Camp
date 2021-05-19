package business.validation;

import entities.concretes.User;

public interface UserValidationService {
	boolean validate (User user);
	boolean validatelogin(String email, String password);
}
