
public enum Symbol {
	Gimel("Gimel"), Hey("Hey"), Shin("Shin"), Nun("Nun");
	
	private String symbol;
	
	private Symbol(String symbol) {
		this.symbol = symbol;
	}
	private String toString() {
		return symbol;
	}
}
