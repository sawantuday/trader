package trader;

public class test {

	public static void main(String[] args) {
		Ticker ticker = Utils.getFromBtce();
		System.out.println("fetching data");
		System.out.println(ticker.toString());

	}

}
