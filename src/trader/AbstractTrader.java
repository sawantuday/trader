package trader;

public abstract class AbstractTrader {
	private double cash;
	private double btc;
	private int sellPercent;
	private int buyPercent;
	private int cashReserve;
	private int btcReserve;
	private int commition;
	
	/**
	 * this method will be override by child classes 
	 * it will give context to trade against
	 */
	public abstract void handleData();
	
	protected void storeResults(){}
	
	protected void order(){}
	
	
}
