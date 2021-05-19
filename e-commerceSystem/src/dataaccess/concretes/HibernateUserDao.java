package dataaccess.concretes;

import java.util.List;

import dataaccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Eklendi "+user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Silindi "+user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Güncellendi. "+user.getFirstName());
		
	}

	@Override
	public List<User> getAll() {
		System.out.println("Listelendi.");
		return null;
	}

	@Override
	public void getById(int id) {
		System.out.println("Getirildi."+id);
		
	}

}
