package business.concretes;

import business.abstracts.AuthService;
import business.validation.UserValidationService;
import core.utils.MailSender;
import dataaccess.abstracts.UserDao;
import entities.concretes.User;

public class AuthManager implements AuthService {
	private UserValidationService userValidationService;
	private UserDao userDao;
	
	public AuthManager(UserDao userDao,UserValidationService userValidationService) {
		this.userDao = userDao;
		this.userValidationService=userValidationService;
	}
	
	@Override
	public void login(String email, String password) {
		if(userValidationService.validatelogin(email, password)) {
			System.out.println("Giriþ Yapýldý.");
		}
		
		
		
	}

	
	@Override
	public void register(User user) {
		if(userValidationService.validate(user)==false) {
		
			System.out.println("hata");
		}
		else
		{
			MailSender.mailSend();
			userDao.add(user);
			
			
		}
		
	
		
	}
}


	


