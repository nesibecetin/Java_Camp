
public class GameManager implements CrudService<Game>{

	@Override
	public void add(Game input) {
		System.out.println("Oyun Eklendi:"+input.getName());
		
	}

	@Override
	public void update(Game input) {
		System.out.println("Oyun Güncellendi:"+input.getName());
		
	}

	@Override
	public void delete(Game input) {
		System.out.println("Oyun Silindi:"+input.getName());
		
	}

}
