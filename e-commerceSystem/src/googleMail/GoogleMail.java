package googleMail;

import entities.concretes.User;

public class GoogleMail {
	public boolean checkIfRealMaik(User user) {
		System.out.println("Mail Ge�erli giri� Yapabilirsiniz."+user.getEmail());
		return true;
		
	}

}
