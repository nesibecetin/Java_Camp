
public class Main {

	public static void main(String[] args) {
		Game game =new Game(1,"Oyun",2);
		Campaign campaign =new Campaign(1,"Kampanya",2.2);
		Gamer gamer =new Gamer(1,"12213211312","Nesibe","Çetin",1998);
		
		GameManager gameManager =new GameManager();
		gameManager.add(game);
		
		CampaignManager campaignManager =new CampaignManager();
		campaignManager.add(campaign);
		
		GamerManager gamerManager=new GamerManager();
		gamerManager.add(gamer);
		
		SalesManager salesManager =new SalesManager();
		salesManager.saleGame(campaign, gamer, game);
	}

}
