package trader;

public class test {

	public static void main(String[] args) {
		TickerWrapper ticker = Utils.getFromBtce();
		System.out.println("fetching data");
		System.out.println(ticker.toString());

	}

}
