package gameHomeWork;

public class GameManager implements GameService{
	
	private SellGameCustomer sellGameCustomer;

	public GameManager(SellGameCustomer sellGameCustomer) {
		this.sellGameCustomer = sellGameCustomer;
	}

	@Override
	public void add(Game game) {
		System.out.println("oyun eklendi: "+game.getGameName());
	}

	@Override
	public void sell(Game game, Customer customer) {
		
		sellGameCustomer.addInfoCustomer(game, customer);
		System.out.println("player id oyun player id ye eklendi: "+game.getPlayerId());
		
	}
	
	

}
