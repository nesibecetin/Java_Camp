package dataaccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	void add (User user);
	void delete(User user);
	void update(User user);
	List<User> getAll();
	void getById(int id);
	

}
