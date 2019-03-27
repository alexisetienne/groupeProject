package co.simplon.entities;

public class Operation {
	
	private int NumOp;
	private double Amount;
	private int NumAt;
	
	public Operation(int numOp, double amount, int numAt) {
		this.NumOp = numOp;
		this.Amount = amount;
		this.NumAt = numAt;
	}

	@Override
	public String toString() {
		return "operation [numero d'operation=" + NumOp + ", Amount=" + Amount + ", Account number=" + NumAt+ "]";
	}

	public int getNumOp() {
		return NumOp;
	}

	public void setNumOp(int NumOp) {
		this.NumOp = NumOp;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double Amount) {
		this.Amount = Amount;
	}

	public int getNumAt() {
		return NumAt;
	}

	public void setNumAt(int NumAt) {
		this.NumAt =NumAt;
	}	

}
