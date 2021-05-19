package business.concretes;

import java.util.List;

import business.abstracts.UserService;
import dataaccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	public UserManager(UserDao userDao) {
	
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void getById(int id) {
		userDao.getById(id);
		
	}

	@Override
	public List<User> getAll() {
		userDao.getAll();
		return null;
	}

}
