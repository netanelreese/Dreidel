
public class Player {
	private int wallet;
	
	public Player(int wallet) {
		this.wallet = wallet;
	}
	public int getWallet() {
		return wallet;
	}
	public void decrementWallet() {
		wallet--;
	}
	public void incrementWallet() {
		wallet++;
	}
}
