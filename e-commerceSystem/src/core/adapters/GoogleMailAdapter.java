package core.adapters;

import core.abstracts.GoogleMailService;
import entities.concretes.User;
import googleMail.GoogleMail;

public class GoogleMailAdapter implements GoogleMailService {



	@Override
	public boolean CheckIfRealMail(User user) {
		GoogleMail googleMail=new GoogleMail();
		googleMail.checkIfRealMaik(user);
		return false;
	}

}
