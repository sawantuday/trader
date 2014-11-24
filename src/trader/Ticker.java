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
	
	public static Ticker fromJSON(String json){
 		JSONParser parser = new JSONParser();
 		Ticker ticker = new Ticker();
		try{
			Object obj = parser.parse(json);
			JSONArray data = (JSONObject)obj;
			JSONObject object = data.get("ticker");
			ticker.setHigh(object.get("high"));
			ticker.setLow(object.get("low");
			ticker.setClose(object.get("last"));
		}catch(ParseException e){
			e.printStackTrace();
			System.out.println("Error occurred while parsing json");
		}
		return ticker;
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
