package trader;

public class Ticker {
	private double open;
	private double high;
	private double low;
	private double close;
	private double timestamp;
	private double volume;
	
	/**
	 * get ticker in JSON format and initialize the values
	 */
	public Ticker(){
		
	}
	
	//TODO
	public boolean isMarobuzo(){
		return false;
	}
	
	//TODO
	public boolean isDancer(){
		return false;
	}
	
	//TODO
	public boolean isShootingStar(){
		return false;
	}

	double getOpen() {
		return open;
	}

	void setOpen(double open) {
		this.open = open;
	}

	double getHigh() {
		return high;
	}

	void setHigh(double high) {
		this.high = high;
	}

	double getLow() {
		return low;
	}

	void setLow(double low) {
		this.low = low;
	}

	double getClose() {
		return close;
	}

	void setClose(double close) {
		this.close = close;
	}

	double getTimestamp() {
		return timestamp;
	}

	void setTimestamp(double timestamp) {
		this.timestamp = timestamp;
	}

	double getVolume() {
		return volume;
	}

	void setVolume(double volume) {
		this.volume = volume;
	}	
}
