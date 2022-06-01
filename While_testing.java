package package01;

import java.util.Scanner;

public class While_testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bal =2000, withdrawAmt=0, displayAmt=0;
		
		//scanner class to take input
		Scanner sc = new Scanner(System.in);
		
		while (withdrawAmt<bal) {
			System.out.println("***Welcome to the Bank withdrawl***");
			System.out.println("Please enter withdraw amount:");
			withdrawAmt = sc.nextInt();
			
		}
		
		displayAmt= bal-withdrawAmt;
		System.out.println("withdrawl success");
		

		
}
}