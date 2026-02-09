package Encapsulate;
class BankAccount{
	private double balance;
	public double getBalance() {
		return balance;
	}
	public void withdrawl(double amount) {
		if (amount > 0) {
			if(amount <= balance) {
				balance -= amount;
				System.out.println("Withdrawl Successful!!\nBalance : " + balance);
			}
			else System.out.println("Insufficient Balance");
		}
		else System.out.println("Enter valid amount");
	}	
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit Successful!!\nBalance : " + balance);
		}
		else System.out.println("Enter valid amount");
	}
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba1 = new BankAccount();
		ba1.deposit(-1);
		ba1.deposit(1000);
		
		
		System.out.println(ba1.getBalance());
		
		ba1.withdrawl(-1);
		ba1.withdrawl(10000);
		ba1.withdrawl(500);
		
	}

}
