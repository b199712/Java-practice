package homework5;

public abstract class Transportation {
	
	protected int price;
	protected int count;
	protected String start, end;
	protected String kind;
	private static int profit;
	private static int totalCount;

	public int getProfit(){
		return this.profit;
	}
	
	public void addTotalPrice(int price){
		this.profit+=price;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void addTotalCount() {
		this.totalCount++;
	}
	
	public void isTraveling(){
		System.out.println("Start: "+this.start+", end: "+this.end+". Use "+this.kind+"!!");
	}
	
	public abstract void select(); 
}
