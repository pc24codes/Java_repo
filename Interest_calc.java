package pack02;

public class Interest_calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance=6000, rateOfInt=.10, interest=0;
		double withdrawl=200, deposit = 500;
		
		for (int i=0; i<=12;i++) {
			balance+=deposit;
			balance-=withdrawl;
			
			interest=balance*rateOfInt;
			balance+=interest;
			
			System.out.println("Interest fro the month is:" + i +" = "+interest);
		}
		System.out.println("bal at end of year is " + balance);
	}

}
