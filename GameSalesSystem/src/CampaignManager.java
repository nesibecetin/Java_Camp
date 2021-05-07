
public class CampaignManager implements CrudService<Campaign>{

	@Override
	public void add(Campaign input) {
		System.out.println("Kampanya Eklendi:"+input.getName());
		
	}

	@Override
	public void update(Campaign input) {
		System.out.println("Kampanya Güncellendi:"+input.getName());
		
	}

	@Override
	public void delete(Campaign input) {
		System.out.println("Kampanya Silindi:"+input.getName());
		
	}

}
