package exercises;

public class RetailBill {
	
	public int billID;
	public int customerID;
	public int discount;
	public double billAmt;
	public double discountedBill;
	
	public void displayBill() {
		System.out.println("***Customer bill details are***");
		System.out.println("BillID: " + billID);
		System.out.println("customerID: "+ customerID);
		System.out.println("Discount "+ discount);
		System.out.println("BillAmt: "+billAmt );
		
		discountedBill = billAmt- billAmt*((float)discount/100); 
		System.out.println("Bill after discount "+discountedBill);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RetailBill rb1 = new RetailBill();
		rb1.billID = 1001;
		rb1.customerID=101;
		rb1.discount=2;
		rb1.billAmt=199.99;
		rb1.displayBill();
	
		RetailBill rb2 = new RetailBill();
		rb2.billID = 1002;
		rb2.customerID=102;
		rb2.discount=4;
		rb2.billAmt=210.5;
		rb2.displayBill();
	}

}
