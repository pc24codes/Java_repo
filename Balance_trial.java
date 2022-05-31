package exercises;

public class Balance_trial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int balance = 500;
		System.out.println("Welcome to a Bank");
		
		int amountToWithdraw= 800;
		System.out.println("Amount requested by user: "+amountToWithdraw);
		
		if (balance>amountToWithdraw || balance<0  ) {
			int transaction= balance-=amountToWithdraw;
			System.out.println("withdrawl is Successful");
			System.out.println("Available amount in the account: "+transaction);
		}
		else {
			
			System.out.println("withdrawl has failed due to insufficient funds");
			
		}
		
			
	}

}
