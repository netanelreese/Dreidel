import java.util.Random;

public class Top {
	private Symbol symbol; //storing the current symbol in the class
	private static int MAXNUM = 3;
	
	public Top(Symbol symbol) {
		this.symbol = symbol; //ensuring symbol isnt null when top object is created in game
	}
	public Symbol getRandomSymbol() {
		Random randNum = new Random();
		
		return randSymbol(randNum.nextInt(MAXNUM) + 1);
	}
	public Symbol randSymbol(int randNum) {
		if (randNum == 1) {
			return Symbol.Shin;
		}
		else if(randNum == 2) {
			return Symbol.Hey;
		}
		else if (randNum == 3) {
			return Symbol.Gimel;
		}
		else {
			return Symbol.Nun;
		}
	}
	
}
