package gameHomeWork;

public class Main {

	public static void main(String[] args) {
		
		Customer bugra = new Customer();
		bugra.setId(60);
		bugra.setNickName("Babasali60");
		CustomerManager customerManager = new CustomerManager(new CheckPersonManager());
		customerManager.add(bugra);
		
		
		Game game = new Game();
		game.setGameName("THE WÝTCHER 3");
		game.setId(1);
		game.setPrice(50);
		
		GameManager gameManager = new GameManager(new InfoCustomer());
		gameManager.sell(game, bugra);
		
		
		
		
		
		
		

	}

}
