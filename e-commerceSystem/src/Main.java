import business.abstracts.AuthService;
import business.concretes.AuthManager;
import business.validation.UserValidation;
import core.adapters.GoogleMailAdapter;
import dataaccess.concretes.HibernateUserDao;
import entities.concretes.User;
import googleMail.GoogleMail;

public class Main {

	public static void main(String[] args) {
		User user=new User(1,"nesibe","cetin","nesibe@nesibe.com","sfssdasa");
		AuthService authManager= new AuthManager(new HibernateUserDao(), new UserValidation());
		authManager.register(user);
		System.out.println("----------------------------------------------");
		authManager.login("nesibe@nesibe.com", "");
		System.out.println("----------------------------------------------");
		GoogleMailAdapter mailAdapter =new GoogleMailAdapter();
		mailAdapter.CheckIfRealMail(user);
		System.out.println("----------------------------------------------");
		
		
		
	}

}
