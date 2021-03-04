package ca.uwaterloo.cs446.smells;

public class Transaction {
	public static void withdrawal(Account account, float amount) {
		if (account.balance < amount) {
			throw new IllegalArgumentException("Insufficient funds");
		}

		account.balance -= amount;
	}

	public static void deposit(Account account, float amount) {
		account.balance += amount;
	}
}
