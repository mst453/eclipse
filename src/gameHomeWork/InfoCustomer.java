package gameHomeWork;

public class InfoCustomer implements SellGameCustomer{

	@Override
	public void addInfoCustomer(Game game,Customer customer) {

		game.setPlayerId(customer.getId());
		System.out.println("oyun sat�s� yap�ld�: "+game.getGameName());
		
	}

	

}
