package ch05.ex08.case04;

public class Main {
	public static void main(String[] args) {
		Deposit deposit = new Deposit();
		deposit = new Deposit(2000);
		deposit = new Deposit(2000, 1000);
		
		System.out.println(deposit.getBalance());
	}
}
