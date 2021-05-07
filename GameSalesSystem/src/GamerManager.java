
public class GamerManager implements CrudService<Gamer> , CheckGamerService{

	@Override
	public void add(Gamer input) {
		if(this.checkIfRealPerson(input)) {
			System.out.println("Oyuncu Eklendi:"+input.getFirstName());
		}
		
		
	}

	@Override
	public void update(Gamer input) {
		System.out.println("Oyuncu Güncellendi:"+input.getFirstName());
		
	}

	@Override
	public void delete(Gamer input) {
		System.out.println("Oyuncu Silindi:"+input.getFirstName());
		
	}

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		return true;
		
	}

}
