package package01;

import java.util.Scanner;

public class Deposit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double bal=0, depAmt=0;
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Please enter an amount to deposit");
			depAmt=sc.nextInt();
			
			
		}while(depAmt<bal);
		bal=depAmt;
		System.out.println("Rs."+ depAmt+"  is deposited Successfully ");
		
		
		
		
		
	}

}
