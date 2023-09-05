package Assignment;

public class ArtCommission {
	String artId;
	int deadline, profit;

	public ArtCommission(String id, int deadline, int profit)
	{
		this.artId = id;
		this.deadline = deadline;
		this.profit = profit;
	}
	
	public String getId() {
		return artId;
	}
	
	public int getDeadline() {
		return deadline;
	}
	
	public int getProfit() {
		return profit;
	}	
	
}
