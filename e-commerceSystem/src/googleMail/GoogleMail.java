package googleMail;

import entities.concretes.User;

public class GoogleMail {
	public boolean checkIfRealMaik(User user) {
		System.out.println("Mail Geçerli giriþ Yapabilirsiniz."+user.getEmail());
		return true;
		
	}

}
