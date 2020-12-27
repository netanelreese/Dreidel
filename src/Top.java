import java.util.Random;

public class Top {
	private static int MAXNUM = 3;
	
	public Symbol getRandomSymbol() {
		Random randNum = new Random(); // creating random object to create random numbers
		
		return randSymbol(randNum.nextInt(MAXNUM) + 1); // generating random number for symbol "+ 1" is to counteract the - 1 used by the
		//nextInt Method
	}
	public Symbol randSymbol(int randNum) { // using numbers to simplify random selection of symbols
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
