package co.simplon.entities;

public class Operation {
	
	private int NumOp;
	private double Amount;
	private int NumCt;
	
	public Operation(int numOp, double amount, int numCt) {
		this.NumOp = numOp;
		this.Amount = amount;
		this.NumCt = numCt;
	}

	@Override
	public String toString() {
		return "operation [numero d'operation=" + NumOp + ", Amount=" + Amount + ", Account number=" + NumCt+ "]";
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

	public int getNumCt() {
		return NumCt;
	}

	public void setNumCt(int NumCt) {
		this.NumCt =NumCt;
	}	

}
