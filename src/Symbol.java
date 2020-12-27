
public enum Symbol {
	Gimel("Gimel"), Hey("Hey"), Shin("Shin"), Nun("Nun");
	
	private String symbol;
	
	private Symbol(String symbol) {
		this.symbol = symbol;
	}
	public String toString() {
		return symbol;
	}
}
