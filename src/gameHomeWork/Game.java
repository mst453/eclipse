package gameHomeWork;

public class Game {
	private int id;
	private String gameName;
	private String gameType;
	private double price;
	private String relasedate;
	private int PlayerId;
	
	
	
	public Game() {
		
	}


	public Game(int id, String gameName, String gameType, double price, String relasedate, int playerId) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.gameType = gameType;
		this.price = price;
		this.relasedate = relasedate;
		PlayerId = playerId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public String getGameType() {
		return gameType;
	}


	public void setGameType(String gameType) {
		this.gameType = gameType;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getRelasedate() {
		return relasedate;
	}


	public void setRelasedate(String relasedate) {
		this.relasedate = relasedate;
	}


	public int getPlayerId() {
		return PlayerId;
	}


	public void setPlayerId(int playerId) {
		PlayerId = playerId;
	}
	
	
	
	
	
	
}
