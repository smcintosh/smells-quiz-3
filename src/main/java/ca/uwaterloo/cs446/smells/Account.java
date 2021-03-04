package ca.uwaterloo.cs446.smells;

public class Account {
	public int transitNumber;
	public int branchNumber;
	public int accountNumber;
	public float balance;

	public Account(int transitNumber, int branchNumber, int accountNumber) {
		this.transitNumber = transitNumber;
		this.branchNumber = branchNumber;
		this.accountNumber = accountNumber;
		this.balance = 0.0f;
	}
}
