package trader;

public class TickerWrapper {
	public Ticker ticker;
	public static class Ticker {
		public double high ;
		public double low ;
		public double avg ;
		public double vol ;
		public double vol_cur ;
		public double last ;
		public double buy ;
		public double sell ;
		public long updated ;
		public long server_time ;
	}
}
