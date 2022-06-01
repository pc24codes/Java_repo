package package01;

public class Account {

private double balance = 500.0;
	
	public double getBalance(int accNumber) {
		
		
		return balance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		
		double value = a1.getBalance(123446);
		System.out.println(value);
		
	}

}
