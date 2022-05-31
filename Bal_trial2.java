package exercises;

public class Bal_trial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 0;
		System.out.println("Welcome to a Bank");
		
		int amountToWithdraw= 1500;
		System.out.println("Amount requested by user: "+amountToWithdraw);
		
		if (balance>amountToWithdraw) {
			int transaction= balance-=amountToWithdraw;
			System.out.println("withdrawl is Successful");
			System.out.println("Available amount in the account: "+transaction);
		}
		
		else if(balance<=0){
		System.out.println("Transaction failed due to incorrect amount!");
		}
		
		else {
			System.out.println("withdrawl has failed due to insufficient funds");
			}
		
			
	}

	}


